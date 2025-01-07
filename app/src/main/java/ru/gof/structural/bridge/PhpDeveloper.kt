package ru.gof.structural.bridge

import ru.gof.utils.showMessage

class PhpDeveloper: Developer {
    override fun writeCode() {
        showMessage("   ${this.javaClass.simpleName} пишет код")
    }
}