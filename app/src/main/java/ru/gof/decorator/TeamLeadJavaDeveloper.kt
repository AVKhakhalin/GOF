package ru.gof.decorator

class TeamLeadJavaDeveloper(
    private val developer: Developer
): DeveloperDecorator(developer) {
    fun doReport(): String {
        return "Отправка отчёта Заказчику."
    }

    override fun doJob(): String {
        return "${developer.doJob()} ${doReport()}"
    }
}