package ru.gof.factory_method.items

import ru.gof.utils.showMessage

class CppDeveloper: Developer {
    override fun writeCode() {
        showMessage("${javaClass.simpleName} пишет С++ код")
    }
}