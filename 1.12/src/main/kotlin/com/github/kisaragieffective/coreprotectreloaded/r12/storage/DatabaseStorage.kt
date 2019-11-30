package com.github.kisaragieffective.coreprotectreloaded.r12.storage

import com.github.kisaragieffective.coreprotectreloaded.r12.CoreProtectReloaded
import org.bukkit.entity.Player
import java.io.Closeable
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.util.LinkedList

// TODO: 一回一回コミットするのはあまりにも遅いので、適当なQueueにねじ込んで、待ち行列が一杯になった時点か一定時間間隔、またはその両方でフラッシュかつコミットする
class DatabaseStorage : IDataStorage, Closeable {
    private val connection: Connection
    override fun close() {
        connection.commit()
        connection.close()
    }

    init {
        val log = CoreProtectReloaded.instance.logger
        log.info("Storage: Database (SQLite)")
        Class.forName("org.sqlite.JDBC")
        val file = File(CoreProtectReloaded.instance.dataFolder.canonicalPath, "log.db")
        file.createNewFile()
        connection = DriverManager.getConnection("jdbc:sqlite:$file")

        if (!CoreProtectReloaded.instance.config.getBoolean("storage.database.initlized", false)) {
            connection.createStatement().use { stmt ->
                setOf("chat", "player_uuid", "player_name").forEach {
                    //language=SQL
                    stmt.executeUpdate("""
                        |BEGIN TRANSACTION;
                        |DROP TABLE IF EXISTS $it;
                        |END TRANSACTION;
                    """.trimMargin())
                }

                setOf("player").forEach {
                    //language=SQL
                    stmt.executeUpdate("""
                        |BEGIN TRANSACTION;
                        |DROP VIEW IF EXISTS $it;
                        |END TRANSACTION;
                    """.trimMargin())
                }

                val sql = (URL("https://pastebin.com/raw/SH41P3Ap").openConnection() as HttpURLConnection).apply {
                    connect()
                }.inputStream.bufferedReader().lineSequence().joinToString("\n")
                connection.createStatement().use {
                    it.executeUpdate(sql)
                }
            }
        }
    }

    override fun logChat(unixEpoch: Long, who: Player, text: String) {
        assertLength(text, 256)
        val playerId = getPlayerId(who)
        val statement = connection.createStatement()
        statement.use {
            //language=SQL
            it.executeUpdate("""
            |BEGIN TRANSACTION
            |INSERT INTO chat VALUES($unixEpoch, $playerId, '$text');
            |END TRANSACTION
        """.trimMargin())
        }
    }

    override fun logCommand(unixEpoch: Long, who: Player, command: String) {
        assertLength(command, 256)
        val playerId = getPlayerId(who)
        val statement = connection.createStatement()
        statement.use {
            //language=SQL
            it.executeUpdate("""
            |BEGIN TRANSACTION
            |INSERT INTO command VALUES($unixEpoch, $playerId, '$command');
            |END TRANSACTION
        """.trimMargin())
        }
    }

    private fun assertLength(cs: CharSequence, limit: Int) {
        require(cs.length < limit) { "Given string is too long! (Limit=$limit,Actual=${cs.length})" }
    }

    fun getPlayerId(who: Player): Int {
        val statement = connection.createStatement()
        statement.use {
            //language=SQL
            val count = it.executeQuery("""
                |SELECT COUNT(id) FROM player_uuid WHERE uuid = '${who.uniqueId}';
            """.trimMargin()).getInt(1)
            if (count == 0) { // not found
                addPlayer(who)
            }

            //language=SQL
            return it.executeQuery("""
                    |SELECT id FROM player_uuid WHERE uuid = '${who.uniqueId}';
                """.trimMargin()).getInt("id")
        }
    }

    private fun addPlayer(who: Player) {
        val statement = connection.createStatement()
        statement.run {
            val it = this
            //language=SQL
            val t = it.executeQuery("""
                    |SELECT id FROM player_uuid ORDER BY id DESC;
                """.trimMargin())
            CoreProtectReloaded.instance.logger.info("ResultSet.closed = ${t.isClosed}")

            val lastID = t.getInt(1)
            val nextID = lastID + 1
            //language=SQL
            it.executeUpdate("""
                    |INSERT INTO player_uuid VALUES($nextID, '${who.uniqueId}')
                """.trimMargin())
        }
    }

    fun query(s: String): Sequence<Map<String, *>> {
        connection.createStatement().use {
            return it.executeQuery(

                    s
            ).each {
                val ret = HashMap<String, Any?>()
                for (i in (1..this.metaData.columnCount)) {
                    val colName = this.metaData.getColumnName(i)
                    ret[colName] = this.getObject(colName)
                }
                ret
            }
        }
    }

    fun flush() {
        try {
            connection.commit()
        } catch (e: SQLException) {
            CoreProtectReloaded.instance.logger.warning("SQLException: ${e.message}")
            e.stackTrace.forEach { CoreProtectReloaded.instance.logger.warning(it.toString()) }
        }
    }

    fun update(s: String): Long {
        connection.createStatement().use {
            return it.executeUpdate(s).toLong()
        }
    }

    private fun <T> ResultSet.each(f: ResultSet.() -> T): Sequence<T> {
        val o = LinkedList<T>()
        while (this.next()) {
            o += f()
        }
        return o.asSequence()
    }

    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}