package ru.gof.visitor

class ProjectTests: ProjectElement {
    override fun doWork(developer: Developer) {
        developer.create(this)
    }
}