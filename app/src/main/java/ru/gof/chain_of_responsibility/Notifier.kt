package ru.gof.chain_of_responsibility

abstract class Notifier {
    abstract val priorityLevel: Priority
    private var nextNotifier: Notifier? = null

    fun setNotifier(currentNotifier: Notifier) {
        nextNotifier = currentNotifier
    }

    fun getPriorityLevel(): Int = priorityLevel.ordinal

    fun notifyManager(message: Message) {
        if (message.getPriorityInt() >= priorityLevel.ordinal) {
            writeMessage(message)
        }

        if (nextNotifier != null) {
            this.nextNotifier?.notifyManager(message)
        }
    }

    protected abstract fun writeMessage(message: Message)
}