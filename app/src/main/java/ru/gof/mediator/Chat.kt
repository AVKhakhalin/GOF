package ru.gof.mediator

interface Chat {
    fun sendMessage(message: String, user: User)
}