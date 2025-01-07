package ru.gof.behavioral.mediator

import ru.gof.utils.showMessage

class AdminUser(
    private val chat: Chat,
    private var name: String
): User {
    override fun getName() = name
    fun setName(newName: String) {
        name = newName
    }

    override fun sendMessage(message: String) {
        chat.sendMessage(message, this)
    }

    override fun getMessage(message: String) {
        showMessage("Администратор \"$name\" получил сообщение: $message")
    }
}