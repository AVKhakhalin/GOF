package ru.gof.structural.decorator

class SeniorJavaDeveloper(
    private val developer: Developer
): DeveloperDecorator(developer) {
    fun doCodeReview(): String {
        return "Ревью кода."
    }

    override fun doJob(): String {
        return "${developer.doJob()} ${doCodeReview()}"
    }
}