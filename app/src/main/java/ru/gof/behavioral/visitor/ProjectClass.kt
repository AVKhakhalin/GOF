package ru.gof.behavioral.visitor

class ProjectClass: ProjectElement {
    override fun doWork(developer: Developer) {
        developer.create(this)
    }
}