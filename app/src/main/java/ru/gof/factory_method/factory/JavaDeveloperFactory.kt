package ru.gof.factory_method.factory

import ru.gof.factory_method.items.Developer
import ru.gof.factory_method.items.JavaDeveloper

class JavaDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = JavaDeveloper()
}