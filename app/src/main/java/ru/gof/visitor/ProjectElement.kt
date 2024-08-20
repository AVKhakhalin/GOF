package ru.gof.visitor

interface ProjectElement {
    fun doWork(developer: Developer)
}