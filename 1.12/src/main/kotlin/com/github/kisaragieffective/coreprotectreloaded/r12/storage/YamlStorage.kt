package com.github.kisaragieffective.coreprotectreloaded.r12.storage

import com.github.kisaragieffective.coreprotectreloaded.r12.CoreProtectReloaded
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.log.ChatLog
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.log.CommandLog
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.configuration.serialization.ConfigurationSerialization
import org.bukkit.entity.Player
import java.io.Closeable
import java.io.File
import java.util.ArrayDeque

class YamlStorage : IDataStorage, Closeable {
    private val chats = ArrayDeque<ChatLog>(3_000)

    private val ow = File(CoreProtectReloaded.instance.dataFolder, "log/log.yml")
    private val delegate: YamlConfiguration
    init {
        ConfigurationSerialization.registerClass(ChatLog::class.java, "com.github.kisaragieffective.coreprotectreloaded.r12.storage.log.ChatLog")
        delegate = YamlConfiguration.loadConfiguration(ow)
        val chatLogs = delegate.getList("chat", emptyList<ChatLog>())
        if (chatLogs.size == 0) {
            delegate.createSection("chat")
            CoreProtectReloaded.instance.logger.info("init(chat = [])")
            delegate["chat"] = mutableListOf<ChatLog>()
        }

        val commandLogs = delegate.getList("command", emptyList<CommandLog>())!!
        if (commandLogs.size == 0) {
            delegate.createSection("command")
            CoreProtectReloaded.instance.logger.info("init(command = [])")
            delegate["command"] = mutableListOf<CommandLog>()
        }
        delegate.save(ow)
    }

    override fun logChat(unixEpoch: Long, who: Player, message: String) {
        chats.offer(ChatLog(unixEpoch, who, message))
    }

    override fun logCommand(unixEpoch: Long, who: Player, command: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Suppress("UNCHECKED_CAST")
    private fun <K> List<*>.enforce(): List<K> {
        return map { it as K }.toMutableList()
    }

    override fun close() {
        refresh()
    }

    fun refresh() {
        val chatRecords = delegate.getList("chat").filterNotNull()
        val validated = chatRecords.enforce<ChatLog>()
        val finalResult = validated + chats
        delegate["chat"] = finalResult
        delegate.save(ow)
        delegate.load(ow)
    }
}