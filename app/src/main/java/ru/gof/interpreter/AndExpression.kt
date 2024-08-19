package ru.gof.interpreter

class AndExpression(
    private val expressionOne: Expression,
    private val expressionTwo: Expression,
): Expression {
    override fun interpret(context: String): Boolean {
        return expressionOne.interpret(context) && expressionTwo.interpret(context)
    }
}