package ru.gof.structural.adapter.run

import ru.gof.utils.showMessage

fun runAdapterDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----ADAPTER-----")
    val database: ru.gof.structural.adapter.Database =
        ru.gof.structural.adapter.AdapterApplicationToDatabase()

    database.insert()
    database.update()
    database.select()
    database.delete()
}