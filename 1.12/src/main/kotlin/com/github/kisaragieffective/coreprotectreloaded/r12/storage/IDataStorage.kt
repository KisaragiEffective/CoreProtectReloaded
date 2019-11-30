package com.github.kisaragieffective.coreprotectreloaded.r12.storage

import org.bukkit.entity.Player

interface IDataStorage {
    fun logChat(unixEpoch: Long, who: Player, message: String)

    fun logCommand(unixEpoch: Long, who: Player, command: String)
}