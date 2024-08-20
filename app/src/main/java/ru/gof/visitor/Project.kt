package ru.gof.visitor

class Project(
    private val listProjectElements: List<ProjectElement>
): ProjectElement {

    override fun doWork(developer: Developer) {
        listProjectElements.forEach {
            it.doWork(developer)
        }
    }
}