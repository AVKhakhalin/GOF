package ru.gof.abstract_factory.projects.banking

import ru.gof.abstract_factory.items.Developer
import ru.gof.utils.showMessage

class BankingDeveloper: Developer {
    override fun writingCode() {
        showMessage("${javaClass.simpleName} пишет код для Banking")
    }
}