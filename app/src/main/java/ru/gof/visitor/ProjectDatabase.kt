package ru.gof.visitor

class ProjectDatabase: ProjectElement {
    override fun doWork(developer: Developer) {
        developer.create(this)
    }
}