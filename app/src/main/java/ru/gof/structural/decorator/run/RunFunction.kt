package ru.gof.structural.decorator.run

import ru.gof.structural.decorator.Developer
import ru.gof.structural.decorator.JavaDeveloper
import ru.gof.structural.decorator.SeniorJavaDeveloper
import ru.gof.structural.decorator.TeamLeadJavaDeveloper
import ru.gof.utils.showMessage

fun runDecoratorDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----DECORATOR-----")
    val teamLeadJavaDeveloper: Developer =
        TeamLeadJavaDeveloper(SeniorJavaDeveloper(JavaDeveloper()))
    showMessage("Обязанности TeamLeadJava-разработчика:\n${teamLeadJavaDeveloper.doJob()}")
}