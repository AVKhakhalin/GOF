package ru.gof.interpreter

fun getJavaExpression(): Expression {
    val java: Expression = TerminalExpression("Java")
    val javaCore: Expression = TerminalExpression("Java Spring")

    return OrExpression(java, javaCore)
}

fun getJavaEEExpression(): Expression {
    val java: Expression = TerminalExpression("Java")
    val spring: Expression = TerminalExpression("Spring")

    return AndExpression(java, spring)
}