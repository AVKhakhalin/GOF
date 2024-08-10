package ru.gof.abstract_factory.projects.web

import ru.gof.abstract_factory.items.Developer
import ru.gof.utils.showMessage

class WebDeveloper: Developer {
    override fun writingCode() {
        showMessage("${javaClass.simpleName} пишет код для Web")
    }
}