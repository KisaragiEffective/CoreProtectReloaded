package com.github.kisaragieffective.coreprotectreloaded.r12.storage

class StorageSaveException : RuntimeException {
    private var _message: String
    constructor(mes: String) : super(mes) {
        _message = mes
    }

    constructor() : super() {
        _message = ""
    }
}