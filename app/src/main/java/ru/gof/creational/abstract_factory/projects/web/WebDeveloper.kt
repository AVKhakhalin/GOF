package ru.gof.creational.abstract_factory.projects.web

import ru.gof.utils.showMessage

class WebDeveloper: ru.gof.creational.abstract_factory.items.Developer {
    override fun writingCode() {
        showMessage("${javaClass.simpleName} пишет код для Web")
    }
}