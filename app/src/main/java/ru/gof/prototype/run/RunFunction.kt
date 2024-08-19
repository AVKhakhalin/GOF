package ru.gof.prototype.run

import ru.gof.prototype.Project
import ru.gof.prototype.ProjectFactory
import ru.gof.utils.showMessage

fun runPrototypeDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----PROTOTYPE----")
    val project: Project = Project(id = 1, name = "First", data = "Important data")
    val projectFactory: ProjectFactory = ProjectFactory(project)
    showMessage("ОРИГИНАЛ  $project")
    showMessage("ПРОТОТИП ОРИГИНАЛА ${projectFactory.createPrototype()}")
    // Изменения в проекте
    project.let {
        it.id = 2
        it.name = "Second"
        it.data = "Very very important data"
    }
    showMessage("ИЗМЕНЕНИЯ $project")
    synchronized(project) {
        projectFactory.setProject(project)
        showMessage("ПРОТОТИП ИЗМЕНЕНИЙ  ${projectFactory.createPrototype()}")
    }
}