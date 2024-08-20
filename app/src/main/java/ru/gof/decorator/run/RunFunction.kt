package ru.gof.decorator.run

import ru.gof.decorator.Developer
import ru.gof.decorator.JavaDeveloper
import ru.gof.decorator.SeniorJavaDeveloper
import ru.gof.decorator.TeamLeadJavaDeveloper
import ru.gof.utils.showMessage

fun runDecoratorDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----DECORATOR----")
    val teamLeadJavaDeveloper: Developer =
        TeamLeadJavaDeveloper(SeniorJavaDeveloper(JavaDeveloper()))
    showMessage("Обязанности TeamLeadJava-разработчика:\n${teamLeadJavaDeveloper.doJob()}")
}