package ru.gof.creational.abstract_factory.projects.web

import ru.gof.utils.showMessage

class WebTester: ru.gof.creational.abstract_factory.items.Tester {
    override fun testingCode() {
        showMessage("${javaClass.simpleName} тестирует код для Web")
    }
}