package ru.gof.abstract_factory.projects.banking

import ru.gof.abstract_factory.items.Tester
import ru.gof.utils.showMessage

class BankingTester: Tester {
    override fun testingCode() {
        showMessage("${javaClass.simpleName} тестирует код для Banking")
    }
}