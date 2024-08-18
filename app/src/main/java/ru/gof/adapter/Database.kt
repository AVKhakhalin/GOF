package ru.gof.adapter

interface Database {
    fun insert()
    fun update()
    fun select()
    fun delete()
}