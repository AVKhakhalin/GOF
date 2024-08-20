package ru.gof.visitor.run

import ru.gof.utils.showMessage
import ru.gof.visitor.Developer
import ru.gof.visitor.DeveloperJunior
import ru.gof.visitor.DeveloperSenior
import ru.gof.visitor.Project
import ru.gof.visitor.ProjectClass
import ru.gof.visitor.ProjectDatabase
import ru.gof.visitor.ProjectElement
import ru.gof.visitor.ProjectTests

fun runVisitorDemonstration() {
    showMessage("\n\n-----PROXY----")
    val project: ProjectElement = Project(listOf(ProjectDatabase(), ProjectClass(), ProjectTests()))
    val seniorDeveloper: Developer = DeveloperSenior()
    val juniorDeveloper: Developer = DeveloperJunior()
    showMessage("Работа над проектом началась:")
    project.doWork(seniorDeveloper)
    project.doWork(juniorDeveloper)
}