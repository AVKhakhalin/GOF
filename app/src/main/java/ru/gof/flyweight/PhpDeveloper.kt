package ru.gof.flyweight

import ru.gof.utils.showMessage

class PhpDeveloper: Developer {
    override fun writeCode() {
        showMessage("PHP разработчик пишет код")
    }
}