package ru.gof.bridge

import ru.gof.utils.showMessage

class BankingProgram(
    override var developers: List<Developer>
): Program() {
    override fun developProgram() {
        showMessage("${this.javaClass.simpleName} разрабатывается:\n")
        developers.forEach {
            it.writeCode()
        }
    }
}