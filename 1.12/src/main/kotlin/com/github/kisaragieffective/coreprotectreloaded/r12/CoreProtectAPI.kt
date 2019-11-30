package com.github.kisaragieffective.coreprotectreloaded.r12

import com.github.kisaragieffective.coreprotectreloaded.common.ICoreProtectAPI
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.DatabaseStorage
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.IDataStorage
import com.github.kisaragieffective.coreprotectreloaded.r12.storage.YamlStorage

object CoreProtectAPI : ICoreProtectAPI {
    private val ds = YamlStorage()
    override fun getVersion(): Int {
        return 1
    }

    override fun isEnabled(): Boolean {
        return true
    }

    override fun queryBlockRemoval() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getDataStorage(): IDataStorage {
        return ds
    }
}
