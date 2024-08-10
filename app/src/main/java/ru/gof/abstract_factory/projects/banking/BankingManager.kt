package ru.gof.abstract_factory.projects.banking

import ru.gof.abstract_factory.items.Manager
import ru.gof.utils.showMessage

class BankingManager: Manager {
    override fun managingProject() {
        showMessage("${javaClass.simpleName} управляет проектом для Banking")
    }
}