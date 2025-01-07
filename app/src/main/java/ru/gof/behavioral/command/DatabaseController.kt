package ru.gof.behavioral.command

import ru.gof.utils.showMessage

class DatabaseController {
    private val database: Database = Database()
    private val cacheCommands: MutableList<Command> = mutableListOf()
    // Инициализация классов с командами
    private val initialise: Initialise = Initialise(database)
    private val insert: Insert = Insert(database)
    private val select: Select = Select(database)
    private val update: Update = Update(database)
    private val delete: Delete = Delete(database)

    fun initialise() {
        initialise.execute()
        executeCacheCommands()
    }
    fun delete() {
        if (!delete.execute()) {
            showMessage("База данных не инициализирована. Команда Delete сохранена в кэше.")
            cacheCommands.add(delete)
        }
        executeCacheCommands()
    }
    fun insert() {
        if (!insert.execute()) {
            showMessage("База данных не инициализирована. Команда Insert сохранена в кэше.")
            cacheCommands.add(insert)
        }
        executeCacheCommands()
    }
    fun select() {
        if (!select.execute()) {
            showMessage("База данных не инициализирована. Команда Select сохранена в кэше.")
            cacheCommands.add(select)
        }
        executeCacheCommands()
    }
    fun update() {
        if (!update.execute()) {
            showMessage("База данных не инициализирована. Команда Update сохранена в кэше.")
            cacheCommands.add(update)
        }
        executeCacheCommands()
    }

    // Запустить команды из кэша
    private fun executeCacheCommands() {
        repeat(cacheCommands.size) {
            if (cacheCommands[0].execute()) {
                showMessage("     " +
                    "(команда ${cacheCommands[0].javaClass.simpleName} успешно выполнена из кэша).")
                // Очистка кэша, в случае успешного выполнения команды
                cacheCommands.removeFirst()
            } else {
                return
            }
        }
    }
}