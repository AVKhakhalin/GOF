package ru.gof.creational.factory_method.factory

import ru.gof.creational.factory_method.items.Developer
import ru.gof.creational.factory_method.items.JavaDeveloper

class JavaDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer = JavaDeveloper()
}