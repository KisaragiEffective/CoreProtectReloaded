package com.github.kisaragieffective.coreprotectreloaded.r12.ext

import java.sql.ResultSet

inline fun ResultSet.moveToFirst() = this.first()

inline fun ResultSet.moveToLast() = this.last()

inline fun <reified T> ResultSet.getObject(index: Int): T {
    return this.getObject(index, T::class.java)
}

inline fun <reified T> ResultSet.getObject(label: String): T {
    return this.getObject(label, T::class.java)
}

