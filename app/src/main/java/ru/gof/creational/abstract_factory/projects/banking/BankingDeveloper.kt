package ru.gof.creational.abstract_factory.projects.banking

import ru.gof.utils.showMessage

class BankingDeveloper: ru.gof.creational.abstract_factory.items.Developer {
    override fun writingCode() {
        showMessage("${javaClass.simpleName} пишет код для Banking")
    }
}