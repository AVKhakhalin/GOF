package ru.gof.chain_of_responsibility

import android.util.Log
import ru.gof.view.MainActivity.Companion.GOF_RESULT_TAG

class NotifierImplMMS(
    currentPriority: Priority
): Notifier() {
    override val priorityLevel: Priority = currentPriority

    override fun writeMessage(message: Message) {
        Log.d(GOF_RESULT_TAG,
            "${javaClass}: ПРИОРИТЕТ = ${priorityLevel.ordinal}, СООБЩЕНИЕ: ${message.text}")
    }
}