package com.github.kisaragieffective.coreprotectreloaded.r12.command

import com.github.kisaragieffective.bukkitshortcut.TypedCommandListener
import org.bukkit.command.Command
import org.bukkit.entity.Player

object ReflectionChecker : TypedCommandListener<Player> {
    override fun onCommand(sender: Player, command: Command, args: Array<out String>, label: String): Boolean {
        return true
    }
}