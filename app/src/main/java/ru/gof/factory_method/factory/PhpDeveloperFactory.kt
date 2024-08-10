package ru.gof.factory_method.factory

import ru.gof.factory_method.items.Developer
import ru.gof.factory_method.items.PhpDeveloper

class PhpDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = PhpDeveloper()
}