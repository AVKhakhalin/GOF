package ru.gof.observer

interface Observer {
    fun handleEvent(listVacancies: List<String>)
}