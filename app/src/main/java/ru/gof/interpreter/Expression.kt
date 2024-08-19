package ru.gof.interpreter

interface Expression {
    fun interpret(context: String): Boolean
}