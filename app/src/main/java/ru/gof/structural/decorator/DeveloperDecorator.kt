package ru.gof.structural.decorator

open class DeveloperDecorator(
    private val developer: Developer
): Developer {
    override fun doJob(): String {
        return developer.doJob()
    }
}