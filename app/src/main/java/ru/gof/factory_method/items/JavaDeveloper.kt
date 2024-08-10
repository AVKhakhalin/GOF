package ru.gof.factory_method.items

import ru.gof.utils.showMessage

class JavaDeveloper: Developer {
    override fun writeCode() {
        showMessage("${javaClass.simpleName} пишет Java код")
    }
}