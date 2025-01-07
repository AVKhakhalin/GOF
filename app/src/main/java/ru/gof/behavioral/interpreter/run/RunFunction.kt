package ru.gof.behavioral.interpreter.run

import ru.gof.behavioral.interpreter.Expression
import ru.gof.behavioral.interpreter.getJavaEEExpression
import ru.gof.behavioral.interpreter.getJavaExpression
import ru.gof.utils.showMessage

fun runInterpreterDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----INTERPRETER-----")
    val isJavaDeveloper: Expression = getJavaExpression()
    val isJavaEEDeveloper: Expression = getJavaEEExpression()

    showMessage(
        "Это Java разработчик?\nОтвет: ${isJavaDeveloper.interpret("Java Core")}")
    showMessage(
        "Это Java EE разработчик?\nОтвет: ${isJavaEEDeveloper.interpret("Java Spring")}")
}