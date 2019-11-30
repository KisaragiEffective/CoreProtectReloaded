package com.github.kisaragieffective.coreprotectreloaded.r12.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object CoreProtectReloaded : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command?, label: String?, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender += "This command is for players."
            return true
        }

        if (args.isEmpty()) {
            sender += "/cpr lookup [user=user] [time=??w??d??h??m??s] [action=[chat, command]]"
            return true
        }

        return when (args[0]) {
            "lookup" -> {
                val namedArg = mutableMapOf<String, String>()
                for (i in 1 until args.size) {
                    if ("=" !in args[i]) {
                        sender += "args[$i]: argument must contain '='"
                        return true
                    }

                    val (key, value) = args[i].split("=", limit = 2)
                    namedArg[key] = value
                }

                namedArg.forEach { (t, u) -> sender += "args[$t] = $u" }
                true
            }

            else -> {
                false
            }
        }
    }
}