package ru.gof.decorator

class SeniorJavaDeveloper(
    developer: Developer
): DeveloperDecorator(developer) {
    private fun doCodeReview(): String {
        return "Выполнение CodeReview."
    }

    override fun doJob(): String {
        return "${super.doJob()} ${doCodeReview()}"
    }
}