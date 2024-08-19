package ru.gof.bridge.run

import ru.gof.bridge.BankingProgram
import ru.gof.bridge.CppDeveloper
import ru.gof.bridge.JavaDeveloper
import ru.gof.bridge.PhpDeveloper
import ru.gof.bridge.Program
import ru.gof.bridge.WebProgram
import ru.gof.utils.showMessage

fun runBridgeDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----BRIDGE----")
    val bankingProgram: Program =
        BankingProgram(listOf(CppDeveloper(), JavaDeveloper(), PhpDeveloper())).also {
            it.developProgram()
    }
    val webProgram: Program = WebProgram(listOf(JavaDeveloper(), PhpDeveloper())).also {
        it.developProgram()
    }

}