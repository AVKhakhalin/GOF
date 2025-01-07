package ru.gof.structural.bridge.run

import ru.gof.structural.bridge.CppDeveloper
import ru.gof.structural.bridge.JavaDeveloper
import ru.gof.structural.bridge.PhpDeveloper
import ru.gof.structural.bridge.Program
import ru.gof.structural.bridge.WebProgram
import ru.gof.utils.showMessage

fun runBridgeDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----BRIDGE-----")
    val bankingProgram: Program =
        ru.gof.structural.bridge.BankingProgram(
            listOf(
                CppDeveloper(),
                JavaDeveloper(),
                PhpDeveloper()
            )
        ).also {
            it.developProgram()
    }
    val webProgram: Program = WebProgram(listOf(JavaDeveloper(), PhpDeveloper())).also {
        it.developProgram()
    }

}