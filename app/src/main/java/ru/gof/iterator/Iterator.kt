package ru.gof.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun hasPrevious(): Boolean

    fun next(): Any?
    fun previous(): Any?
}