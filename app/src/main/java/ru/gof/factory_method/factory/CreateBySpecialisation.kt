package ru.gof.factory_method.factory

import ru.gof.factory_method.items.Specialisation

fun createDeveloperBySpecialisation(specialisation: Specialisation): DeveloperFactory {
    return when(specialisation) {
        Specialisation.JAVA -> JavaDeveloperFactory()
        Specialisation.CPP -> CppDeveloperFactory()
        Specialisation.PHP -> PhpDeveloperFactory()
    }
}