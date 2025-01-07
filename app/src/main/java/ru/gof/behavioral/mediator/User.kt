package ru.gof.behavioral.mediator

interface User {
    fun getName(): String

    fun sendMessage(message: String)
    fun getMessage(message: String)
}