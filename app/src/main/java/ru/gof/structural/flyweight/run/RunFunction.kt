package ru.gof.structural.flyweight.run

import ru.gof.structural.flyweight.Developer
import ru.gof.structural.flyweight.DeveloperFactory
import ru.gof.structural.flyweight.DevelopersTypes
import ru.gof.utils.showMessage

fun runFlyweightDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----FLYWEIGHT-----")
    val developers: MutableList<Developer> = mutableListOf()
    val developerFactory: DeveloperFactory = DeveloperFactory()

    developers.add(developerFactory.getDeveloper(DevelopersTypes.JAVA))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.JAVA))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.CPP))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.CPP))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.CPP))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.PHP))
    developers.add(developerFactory.getDeveloper(DevelopersTypes.PHP))

    developers.forEach {
        it.writeCode()
    }
}