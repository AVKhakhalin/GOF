package ru.gof.factory_method.factory

import ru.gof.factory_method.items.Developer

interface DeveloperFactory {
    fun createDeveloper(): Developer
}