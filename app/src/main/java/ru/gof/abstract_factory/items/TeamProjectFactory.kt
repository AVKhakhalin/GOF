package ru.gof.abstract_factory.items

interface TeamProjectFactory {
    fun getDevelopers(numberEmployees: Int): List<Developer>
    fun getTesters(numberEmployees: Int): List<Tester>
    fun getManagers(numberEmployees: Int): List<Manager>
}