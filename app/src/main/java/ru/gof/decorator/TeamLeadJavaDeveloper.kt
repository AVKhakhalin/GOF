package ru.gof.decorator

class TeamLeadJavaDeveloper(
    developer: Developer
): DeveloperDecorator(developer) {
    private fun doReport(): String {
        return "Написание отчёта заказчику."
    }

    override fun doJob(): String {
        return "${super.doJob()} ${doReport()}"
    }
}