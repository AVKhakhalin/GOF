package ru.gof.flyweight.run

import ru.gof.flyweight.Developer
import ru.gof.flyweight.DeveloperFactory
import ru.gof.flyweight.DevelopersTypes
import ru.gof.utils.showMessage

fun runFlyweightRunner() {
    showMessage("")
    showMessage("")
    showMessage("-----FLYWEIGHT----")
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