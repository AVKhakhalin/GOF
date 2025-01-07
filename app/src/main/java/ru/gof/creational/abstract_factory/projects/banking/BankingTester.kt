package ru.gof.creational.abstract_factory.projects.banking

import ru.gof.utils.showMessage

class BankingTester: ru.gof.creational.abstract_factory.items.Tester {
    override fun testingCode() {
        showMessage("${javaClass.simpleName} тестирует код для Banking")
    }
}