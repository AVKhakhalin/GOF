package ru.gof.creational.abstract_factory.projects.banking

import ru.gof.utils.showMessage

class BankingManager: ru.gof.creational.abstract_factory.items.Manager {
    override fun managingProject() {
        showMessage("${javaClass.simpleName} управляет проектом для Banking")
    }
}