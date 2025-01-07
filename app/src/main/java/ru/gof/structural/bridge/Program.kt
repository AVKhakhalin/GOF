package ru.gof.structural.bridge

abstract class Program {
    protected open lateinit var developers: List<Developer>

    abstract fun developProgram()
}