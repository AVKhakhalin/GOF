package ru.gof.behavioral.command

import ru.gof.utils.showMessage

class Database {
    // Признак первичной инициализации (настройки) базы данных
    private var isInitialised: Boolean = false

    // Получить статус базы данных
    fun getInitialiseStatusDatabase() = isInitialised

    // Инициализация базы данных (первичная настройка)
    fun initialise() {
        isInitialised = true
        showMessage(
            "База данных успешно инициализирована (первичная настройка базы данных произведена).")
    }

    fun insert() {
        showMessage("Данные успешно добавлены в базу данных.")
    }

    fun select() {
        showMessage("Из базы данных успешно отобранны данные.")
    }

    fun delete() {
        showMessage("Из базы данных успешно удалены данные.")
    }

    fun update() {
        showMessage("В базе данных успешно обновлены данные.")
    }
}