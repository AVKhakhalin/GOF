package ru.gof.behavioral.interpreter

interface Expression {
    fun interpret(context: String): Boolean
}