package ru.gof.chain_of_responsibility

data class Message (
    val text: String,
    val priority: Priority,
) {
    fun getPriorityInt(): Int = priority.ordinal
}