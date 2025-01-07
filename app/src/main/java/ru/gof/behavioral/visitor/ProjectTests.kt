package ru.gof.behavioral.visitor

class ProjectTests: ProjectElement {
    override fun doWork(developer: Developer) {
        developer.create(this)
    }
}