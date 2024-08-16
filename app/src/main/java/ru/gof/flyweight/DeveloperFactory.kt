package ru.gof.flyweight

import ru.gof.utils.showMessage

class DeveloperFactory {
    private val existentDevelopers: MutableMap<DevelopersTypes, Developer> = mutableMapOf()

    fun getDeveloper(developerType: DevelopersTypes): Developer {
        val developer: Developer =
            existentDevelopers[developerType] ?: when(developerType) {
                DevelopersTypes.JAVA -> JavaDeveloper().also {
                    showMessage("${it.javaClass.simpleName} разработчик нанят")
                    existentDevelopers[developerType] = it
                }
                DevelopersTypes.CPP -> CppDeveloper().also {
                    showMessage("${it.javaClass.simpleName} разработчик нанят")
                    existentDevelopers[developerType] = it
                }
                DevelopersTypes.PHP -> PhpDeveloper().also {
                    showMessage("${it.javaClass.simpleName} разработчик нанят")
                    existentDevelopers[developerType] = it
                }
            }
        return developer
    }
}