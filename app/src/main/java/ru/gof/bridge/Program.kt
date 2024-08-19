package ru.gof.bridge

abstract class Program {
    protected open lateinit var developers: List<Developer>

    abstract fun developProgram()
}