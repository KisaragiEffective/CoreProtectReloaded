import com.github.kisaragieffective.coreprotectreloaded.r12.event.ChatEventHandler

fun main() {
    ChatEventHandler::class.java.methods.forEach {
        println(it)
    }
}