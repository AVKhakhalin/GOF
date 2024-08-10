package ru.gof.abstract_factory.projects.web

import ru.gof.abstract_factory.items.Tester
import ru.gof.utils.showMessage

class WebTester: Tester {
    override fun testingCode() {
        showMessage("${javaClass.simpleName} тестирует код для Web")
    }
}