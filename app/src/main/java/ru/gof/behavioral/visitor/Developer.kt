package ru.gof.behavioral.visitor

interface Developer {
    fun create(projectDatabase: ProjectDatabase)

    fun create(projectClass: ProjectClass)

    fun create(projectTests: ProjectTests)
}