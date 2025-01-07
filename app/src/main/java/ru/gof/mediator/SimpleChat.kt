package ru.gof.mediator

import ru.gof.utils.showMessage

class SimpleChat: Chat {
    private var adminUser: User? = null
    private val users: MutableMap<String, User> = mutableMapOf()

    fun setAdminUser(newAdminUser: User) {
        adminUser = newAdminUser
        showMessage("Администратором чата теперь является пользователь \"${adminUser?.getName()}\".")
    }

    fun addUser(newUser: User) {
        if (users.put(newUser.getName(), newUser) == null) {
            showMessage("Пользователь \"${newUser.getName()}\" успешно добавлен в чат.")
        } else {
            showMessage("Пользователь \"${newUser.getName()}\" уже есть в чате.")
        }
    }

    fun deleteUser(oldUser: User) {
        if (users.remove(oldUser.getName()) != null) {
            showMessage("Пользователь \"${oldUser.getName()}\" успешно удалён из чата.")
        } else {
            showMessage("Пользователь \"${oldUser.getName()}\" не присутствовал в чате.")
        }
    }

    override fun sendMessage(message: String, user: User) {
        users.forEach {
            if (it.value != user) {
                it.value.getMessage(message)
            }
        }
        if (adminUser != null) {
            adminUser?.getMessage(message)
        } else {
            showMessage("Предупреждение: Администратор чата не задан!")
        }
    }
}