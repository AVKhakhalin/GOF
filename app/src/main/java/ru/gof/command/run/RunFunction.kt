package ru.gof.command.run

import ru.gof.command.DatabaseController
import ru.gof.utils.showMessage

fun runCommandDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----COMMAND----")
    val databaseController: DatabaseController = DatabaseController()
    databaseController.insert()
    databaseController.insert()
    databaseController.insert()
    databaseController.delete()
    databaseController.update()
    databaseController.select()
    databaseController.initialise() // Инициализация базы данных происходит только здесь
    databaseController.delete()
    databaseController.select()
    databaseController.insert()
    databaseController.select()
}