package ru.gof.factory_method.items

import ru.gof.utils.showMessage

class PhpDeveloper: Developer {
    override fun writeCode() {
        showMessage("${javaClass.simpleName} пишет PHP код")
    }
}