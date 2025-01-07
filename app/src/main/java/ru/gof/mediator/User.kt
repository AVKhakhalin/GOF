package ru.gof.mediator

interface User {
    fun getName(): String

    fun sendMessage(message: String)
    fun getMessage(message: String)
}