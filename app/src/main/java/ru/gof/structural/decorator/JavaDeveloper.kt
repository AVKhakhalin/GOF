package ru.gof.structural.decorator

class JavaDeveloper: Developer {
    override fun doJob(): String {
        return "Написание Java кода."
    }
}