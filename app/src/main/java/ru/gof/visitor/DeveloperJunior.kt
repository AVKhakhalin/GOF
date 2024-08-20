package ru.gof.visitor

import ru.gof.utils.showMessage

class DeveloperJunior: Developer {
    override fun create(projectDatabase: ProjectDatabase) {
        showMessage("   Реализация запросов к базе данных.")
    }

    override fun create(projectClass: ProjectClass) {
        showMessage("   Реализация интерфейсов в классах.")
    }

    override fun create(projectTests: ProjectTests) {
        showMessage("   Создание юнит-тестов.")
    }
}