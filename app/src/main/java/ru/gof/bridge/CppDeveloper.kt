package ru.gof.bridge

import ru.gof.utils.showMessage

class CppDeveloper: Developer {
    override fun writeCode() {
        showMessage("   ${this.javaClass.simpleName} пишет код")
    }
}