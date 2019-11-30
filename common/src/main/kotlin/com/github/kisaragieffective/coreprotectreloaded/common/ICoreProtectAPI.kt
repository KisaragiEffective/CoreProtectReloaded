package com.github.kisaragieffective.coreprotectreloaded.common

interface ICoreProtectAPI {
    fun queryBlockRemoval()

    fun getVersion(): Int

    fun isEnabled(): Boolean
}