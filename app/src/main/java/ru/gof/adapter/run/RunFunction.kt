package ru.gof.adapter.run

import ru.gof.adapter.AdapterApplicationToDatabase
import ru.gof.adapter.Database
import ru.gof.utils.showMessage

fun runAdapterRunner() {
    showMessage("")
    showMessage("")
    showMessage("-----ADAPTER----")
    val database: Database = AdapterApplicationToDatabase()

    database.insert()
    database.update()
    database.select()
    database.delete()
}