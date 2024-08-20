package ru.gof.decorator

class JavaDeveloper: Developer {
    override fun doJob(): String {
        return "Написание Java кода."
    }
}