package ru.gof.observer

interface Observed {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyAllObservers()
}