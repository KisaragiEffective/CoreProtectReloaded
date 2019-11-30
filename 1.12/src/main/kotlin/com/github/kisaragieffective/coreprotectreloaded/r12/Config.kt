package com.github.kisaragieffective.coreprotectreloaded.r12

object Config {
    val trackChat: Boolean by lazy {
        CoreProtectReloaded.instance.config.getBoolean("function.chat")
    }

    val trackPlacement: Boolean by lazy {
        CoreProtectReloaded.instance.config.getBoolean("function.place")
    }


}