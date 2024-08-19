package ru.gof.interpreter.run

import ru.gof.interpreter.Expression
import ru.gof.interpreter.getJavaEEExpression
import ru.gof.interpreter.getJavaExpression
import ru.gof.utils.showMessage

fun runInterpreterDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----INTERPRETER----")
    val isJavaDeveloper: Expression = getJavaExpression()
    val isJavaEEDeveloper: Expression = getJavaEEExpression()

    showMessage(
        "Это Java разработчик?\nОтвет: ${isJavaDeveloper.interpret("Java Core")}")
    showMessage(
        "Это Java EE разработчик?\nОтвет: ${isJavaEEDeveloper.interpret("Java Spring")}")
}