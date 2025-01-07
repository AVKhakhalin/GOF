package ru.gof.creational.factory_method.run

import ru.gof.creational.factory_method.factory.DeveloperFactory
import ru.gof.creational.factory_method.factory.createDeveloperBySpecialisation
import ru.gof.creational.factory_method.items.Developer
import ru.gof.creational.factory_method.items.Specialisation
import ru.gof.utils.showMessage

fun runFactoryDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----FACTORY METHOD-----")
    val developerFactoryJava: DeveloperFactory =
        createDeveloperBySpecialisation(Specialisation.JAVA)
    val developerJava: Developer = developerFactoryJava.createDeveloper()
    developerJava.writeCode()

    val developerFactoryCpp: DeveloperFactory =
        createDeveloperBySpecialisation(Specialisation.CPP)
    val developerCpp: Developer = developerFactoryCpp.createDeveloper()
    developerCpp.writeCode()

    val developerFactoryPhp: DeveloperFactory =
        createDeveloperBySpecialisation(Specialisation.PHP)
    val developerPhp: Developer = developerFactoryPhp.createDeveloper()
    developerPhp.writeCode()
}