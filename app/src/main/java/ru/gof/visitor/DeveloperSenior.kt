package ru.gof.visitor

import ru.gof.utils.showMessage

class DeveloperSenior: Developer {
    override fun create(projectDatabase: ProjectDatabase) {
        showMessage("   Разработка структуры базы данных.")
    }

    override fun create(projectClass: ProjectClass) {
        showMessage("   Разработка архитектуры программы, её модулей и интерфейсов классов.")
    }

    override fun create(projectTests: ProjectTests) {
        showMessage("   Создание инструментальных тестов.")
    }
}