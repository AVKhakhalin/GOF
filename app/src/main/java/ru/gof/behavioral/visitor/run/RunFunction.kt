package ru.gof.behavioral.visitor.run

import ru.gof.behavioral.visitor.Developer
import ru.gof.behavioral.visitor.DeveloperJunior
import ru.gof.behavioral.visitor.DeveloperSenior
import ru.gof.behavioral.visitor.Project
import ru.gof.behavioral.visitor.ProjectClass
import ru.gof.behavioral.visitor.ProjectDatabase
import ru.gof.behavioral.visitor.ProjectElement
import ru.gof.behavioral.visitor.ProjectTests
import ru.gof.utils.showMessage

fun runVisitorDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----PROXY-----")
    val project: ProjectElement = Project(listOf(ProjectDatabase(), ProjectClass(), ProjectTests()))
    val seniorDeveloper: Developer = DeveloperSenior()
    val juniorDeveloper: Developer = DeveloperJunior()
    showMessage("Работа над проектом началась:")
    project.doWork(seniorDeveloper)
    project.doWork(juniorDeveloper)
}