package ru.gof.template_method

import ru.gof.utils.showMessage

abstract class WebSite {
    fun showContent() {
        showMessage("${this.javaClass.simpleName}:")
        showMessage("   Заголовок")
        showText()
        showMessage("   Окончание")
    }

    abstract fun showText()
}