package ru.gof.factory_method.factory

import ru.gof.factory_method.items.CppDeveloper
import ru.gof.factory_method.items.Developer

class CppDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = CppDeveloper()
}