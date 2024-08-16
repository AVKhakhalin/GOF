package ru.gof.flyweight

import ru.gof.utils.showMessage

class CppDeveloper: Developer {
    override fun writeCode() {
        showMessage("С++ разработчик пишет код")
    }
}