package ru.gof.structural.bridge

import ru.gof.utils.showMessage

class BankingProgram(
    override var developers: List<ru.gof.structural.bridge.Developer>
): ru.gof.structural.bridge.Program() {
    override fun developProgram() {
        showMessage("${this.javaClass.simpleName} разрабатывается:\n")
        developers.forEach {
            it.writeCode()
        }
    }
}