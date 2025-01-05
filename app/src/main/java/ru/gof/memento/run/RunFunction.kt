package ru.gof.memento.run

import ru.gof.memento.GitHubRepo
import ru.gof.memento.Project
import ru.gof.utils.showMessage

fun runMementoDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----MEMENTO----")
    val gitHubRepo: GitHubRepo = GitHubRepo()
    val project: Project =
        Project(
            name = "NewGame",
            version = "1.0",
        )
    showMessage("$project")
    gitHubRepo.pushCommit(project.saveProject())
    project.setNameVersionDate(newVersion = "1.1")
    showMessage("$project")
    gitHubRepo.pushCommit(project.saveProject())
    project.setNameVersionDate(newVersion = "2.0")
    showMessage("$project")
    // Загрузка проекта из репозитория по его версии
    project.loadProject(gitHubRepo.fetchCommit("1.0"))
    showMessage("$project")
}