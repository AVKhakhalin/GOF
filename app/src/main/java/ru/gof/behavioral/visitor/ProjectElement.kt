package ru.gof.behavioral.visitor

interface ProjectElement {
    fun doWork(developer: Developer)
}