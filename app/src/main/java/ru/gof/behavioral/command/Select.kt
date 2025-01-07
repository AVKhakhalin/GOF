package ru.gof.behavioral.command

// В конструкторе класса не заданы данные для базы данных для упрощения модели паттерна Command
class Select (private val database: Database): Command {
    override fun execute(): Boolean {
        return if(database.getInitialiseStatusDatabase()) {
            database.select()
            true
        } else {
            false
        }
    }
}