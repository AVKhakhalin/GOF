package ru.gof.creational.abstract_factory.items

interface TeamProjectFactory {
    fun getDevelopers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Developer>
    fun getTesters(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Tester>
    fun getManagers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Manager>
}