package ru.gof.structural.adapter

class AdapterApplicationToDatabase: ru.gof.structural.adapter.Application(),
    ru.gof.structural.adapter.Database {
    override fun insert() {
        saveObject()
    }

    override fun update() {
        updateObject()
    }

    override fun select() {
        loadObject()
    }

    override fun delete() {
        deleteObject()
    }

}