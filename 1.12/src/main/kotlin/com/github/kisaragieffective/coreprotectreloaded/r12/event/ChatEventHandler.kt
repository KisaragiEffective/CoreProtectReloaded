package com.github.kisaragieffective.coreprotectreloaded.r12.event

import com.github.kisaragieffective.bukkitshortcut.TypedEventListener
import com.github.kisaragieffective.coreprotectreloaded.r12.CoreProtectAPI
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.DatabaseStorage
import org.bukkit.Bukkit
import org.bukkit.event.player.AsyncPlayerChatEvent

object ChatEventHandler : TypedEventListener<AsyncPlayerChatEvent> {
    override fun onEvent(event: AsyncPlayerChatEvent) {
        Bukkit.getConsoleSender().sendMessage(event.format)
        CoreProtectAPI.getDataStorage().logChat(System.currentTimeMillis(), event.player, event.message)
    }
}
