package com.github.kisaragieffective.coreprotectreloaded.r12.storage.log

import org.bukkit.configuration.serialization.ConfigurationSerializable
import org.bukkit.entity.Player

data class ChatLog(val unixEpoch: Long, val player: Player, val message: String) : ConfigurationSerializable {
    override fun serialize(): MutableMap<String, Any> {
        return mutableMapOf("time" to unixEpoch, "player" to player.uniqueId.toString(), "messsage" to message)
    }
}