package com.github.kisaragieffective.coreprotectreloaded.r12

import com.github.kisaragieffective.bukkitshortcut.extension.registerEventHandler
import com.github.kisaragieffective.coreprotectreloaded.r12.command.DirectlyDatabaseTouchCommand
import com.github.kisaragieffective.coreprotectreloaded.r12.event.ChatEventHandler
import org.bukkit.entity.EntityType
import org.bukkit.event.EventPriority
import org.bukkit.plugin.java.JavaPlugin
import java.io.File
import sun.net.www.ParseUtil.toURI
import java.io.Closeable
import java.net.URL
import java.net.URLClassLoader
import com.github.kisaragieffective.coreprotectreloaded.r12.command.CoreProtectReloaded as CoreProtectReloadedCommand

@Suppress("UNUSED")
class CoreProtectReloaded : JavaPlugin() {
    init {
        instance = this
    }

    override fun onEnable() {
        logger.info("""
            CoreProtect<Reloaded> v${this.description.version} by ${this.description.authors}
            Source is available at https://github.com/KisaragiEffective/CoreProtectReloaded
        """.trimIndent())
        if (!this.dataFolder.exists()) {
            this.dataFolder.mkdirs()
        }

        if (!this.config.contains("storage.database.initialized")) {
            config.createSection("storage")
            config.createSection("storage.database")
            config.set("storage.database.initialized", false)
        }

        mapOf(
                "dbupdate" to DirectlyDatabaseTouchCommand,
                "cpr" to CoreProtectReloadedCommand
        ).forEach { (t, u) -> getCommand(t).executor = u }

        server.worlds.forEach { w ->
            val tnts = w.entities.filter {
                it.isValid && it.type == EntityType.PRIMED_TNT
            }

            logger.info("" + tnts.size)
            tnts.forEach {
                it.remove()
            }
        }

        registerEventHandler(ChatEventHandler, EventPriority.MONITOR)
    }

    override fun onDisable() {
        logger.info("Closing DataStorage")
        val ds = CoreProtectAPI.getDataStorage()
        if (ds is Closeable) {
            ds.close()
        }
        logger.info("Done")
        logger.info("Goodbye!")
    }

    companion object {
        lateinit var instance: CoreProtectReloaded
    }
}

private fun <E> Iterable<E>.peek(function: (E) -> Unit): Iterable<E> {
    this.forEach {
        function(it)
    }
    return this
}
