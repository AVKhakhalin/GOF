package ru.gof.creational.abstract_factory.projects.web

import ru.gof.utils.showMessage

class WebManager: ru.gof.creational.abstract_factory.items.Manager {
    override fun managingProject() {
        showMessage("${javaClass.simpleName} управляет проектом для Web")
    }
}