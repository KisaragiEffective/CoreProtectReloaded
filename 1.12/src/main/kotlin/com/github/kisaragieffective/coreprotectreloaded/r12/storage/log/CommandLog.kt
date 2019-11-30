package com.github.kisaragieffective.coreprotectreloaded.r12.storage.log

import org.bukkit.configuration.serialization.ConfigurationSerializable
import org.bukkit.entity.Player

data class CommandLog(val unixEpoch: Long, val who: Player, val command: String) : ConfigurationSerializable {
    override fun serialize(): MutableMap<String, Any> {
        return mutableMapOf("time" to unixEpoch, "player" to who.uniqueId.toString(), "command" to command)
    }
}