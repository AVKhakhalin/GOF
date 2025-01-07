package ru.gof.behavioral.memento

data class Save(
    val name: String,
    val version: String,
    val dateTime: Long,
)