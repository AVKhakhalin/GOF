package ru.gof.behavioral.observer

interface Observer {
    fun handleEvent(listVacancies: List<String>)
}