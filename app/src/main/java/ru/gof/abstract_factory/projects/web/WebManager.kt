package ru.gof.abstract_factory.projects.web

import ru.gof.abstract_factory.items.Manager
import ru.gof.utils.showMessage

class WebManager: Manager {
    override fun managingProject() {
        showMessage("${javaClass.simpleName} управляет проектом для Web")
    }
}