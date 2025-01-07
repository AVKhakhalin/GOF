package ru.gof.behavioral.visitor

class ProjectDatabase: ProjectElement {
    override fun doWork(developer: Developer) {
        developer.create(this)
    }
}