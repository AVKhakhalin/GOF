package ru.gof.adapter

import ru.gof.utils.showMessage

open class Application {
    fun saveObject() {
        showMessage("Объект сохранён")
    }

    fun updateObject() {
        showMessage("Объект обновлён")
    }

    fun loadObject() {
        showMessage("Объект загружен")
    }

    fun deleteObject() {
        showMessage("Объект удалён")
    }
}