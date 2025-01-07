package ru.gof.behavioral.mediator

interface Chat {
    fun sendMessage(message: String, user: User)
}