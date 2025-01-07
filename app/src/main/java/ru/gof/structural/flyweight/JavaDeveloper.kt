package ru.gof.structural.flyweight

import ru.gof.utils.showMessage

class JavaDeveloper: Developer {
    override fun writeCode() {
        showMessage("Java разработчик пишет код")
    }
}