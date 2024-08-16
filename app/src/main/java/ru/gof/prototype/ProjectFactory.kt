package ru.gof.prototype

class ProjectFactory(
    private var project: Project
) {

    fun setProject(project: Project) {
        this.project = project
    }

    fun createPrototype(): Project {
        return project.clonePrototype() as Project
    }
}