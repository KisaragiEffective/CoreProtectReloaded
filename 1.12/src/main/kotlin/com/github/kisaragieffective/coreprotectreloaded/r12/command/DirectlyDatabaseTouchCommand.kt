package com.github.kisaragieffective.coreprotectreloaded.r12.command

import com.github.kisaragieffective.bukkitshortcut.TypedCommandListener
import com.github.kisaragieffective.coreprotectreloaded.r12.CoreProtectAPI
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.DatabaseStorage
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender
import org.bukkit.entity.Player
import java.sql.SQLException

object DirectlyDatabaseTouchCommand : TypedCommandListener<CommandSender> {
    override fun onCommand(sender: CommandSender, command: Command, args: Array<out String>, label: String): Boolean {
        return when (sender) {
            is Player, is ConsoleCommandSender -> {
                onCommand0(sender, command, args, label)
            }
            else -> {
                sender += "You don't have permission to do that."
                true
            }
        }
    }

    fun onCommand0(sender: CommandSender, command: Command, args: Array<out String>, label: String): Boolean {
        if (args.isEmpty()) {
            sender += "Operation is not executed."
            return true
        }

        val dbs = (CoreProtectAPI.getDataStorage() as DatabaseStorage)
        val sql = args.slice(1 until args.size).joinToString(" ")
        try {
            when (args[0]) {
                "query" -> {
                    sender += "----------QUERY"
                    sender += dbs.query(sql).map {
                        it.values
                    }.map {
                        it.joinToString("|", prefix = "|", postfix = "|")
                    }.joinToString("\n")
                    sender += "----------QUERY"
                    dbs.flush()
                }

                "update" -> {
                    sender += "Updated " + dbs.update(sql) + " entries!"
                    dbs.flush()
                }

                else -> {
                    sender += "update/query"
                }
            }
        } catch (e: SQLException) {
            sender += "Exception caught: Code ${e.errorCode}; ${e.message}"
            sender += "Operation cancelled."
        } catch (e: Throwable) {
            sender += "Exception caught: ${e::class.java.name}; ${e.message}"
            sender += "Operation cancelled."
        }

        return true
    }
}

operator fun CommandSender.plusAssign(s: String) {
    this.sendMessage(s)
}
