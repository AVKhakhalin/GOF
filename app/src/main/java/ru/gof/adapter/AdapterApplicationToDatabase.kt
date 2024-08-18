package ru.gof.adapter

class AdapterApplicationToDatabase: Application(), Database {
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