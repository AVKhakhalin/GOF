package ru.gof.bridge

import ru.gof.utils.showMessage

class JavaDeveloper: Developer {
    override fun writeCode() {
        showMessage("   ${this.javaClass.simpleName} пишет код")
    }
}