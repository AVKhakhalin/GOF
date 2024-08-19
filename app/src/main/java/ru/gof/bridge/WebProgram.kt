package ru.gof.bridge

import ru.gof.utils.showMessage

class WebProgram(
    override var developers: List<Developer>
): Program() {
    override fun developProgram() {
        showMessage("${this.javaClass.simpleName} разрабатывается:\n")
        developers.forEach {
            it.writeCode()
        }
    }
}