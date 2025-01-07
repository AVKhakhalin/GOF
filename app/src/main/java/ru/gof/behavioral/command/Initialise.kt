package ru.gof.behavioral.command

// В конструкторе класса не заданы данные для базы данных для упрощения модели паттерна Command
class Initialise (private val database: Database): Command {
    override fun execute(): Boolean {
        if (!database.getInitialiseStatusDatabase()) {
            database.initialise()
        }
        return true
    }
}