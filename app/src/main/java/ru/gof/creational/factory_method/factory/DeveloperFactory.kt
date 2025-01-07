package ru.gof.creational.factory_method.factory

import ru.gof.creational.factory_method.items.Developer

interface DeveloperFactory {
    fun createDeveloper(): Developer
}