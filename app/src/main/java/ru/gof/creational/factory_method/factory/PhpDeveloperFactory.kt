package ru.gof.creational.factory_method.factory

import ru.gof.creational.factory_method.items.Developer
import ru.gof.creational.factory_method.items.PhpDeveloper

class PhpDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = PhpDeveloper()
}