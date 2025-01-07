package ru.gof.structural.facade.run

import ru.gof.structural.facade.WorkFlow
import ru.gof.utils.showMessage

fun runFacadeDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----FACADE-----")
    val workFlow: WorkFlow = WorkFlow("Разработка логики игры")
    workFlow.startJob()
    workFlow.startJob()
    workFlow.stopJob()
}