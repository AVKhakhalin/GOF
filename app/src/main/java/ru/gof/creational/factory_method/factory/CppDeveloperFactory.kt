package ru.gof.creational.factory_method.factory

import ru.gof.creational.factory_method.items.CppDeveloper
import ru.gof.creational.factory_method.items.Developer

class CppDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = CppDeveloper()
}