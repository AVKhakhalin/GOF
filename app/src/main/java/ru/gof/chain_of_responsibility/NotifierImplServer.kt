package ru.gof.chain_of_responsibility

import ru.gof.utils.showMessage

class NotifierImplServer(
    currentPriority: Priority
): Notifier() {
    override val priorityLevel: Priority = currentPriority

    override fun writeMessage(message: Message) {
        showMessage(
            "${javaClass}: ПРИОРИТЕТ = ${priorityLevel.ordinal}, СООБЩЕНИЕ: ${message.text}")
    }
}