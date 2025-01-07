package ru.gof.behavioral.state.run

import ru.gof.behavioral.state.Developer
import ru.gof.behavioral.state.HumanActivity
import ru.gof.behavioral.state.Sleeping
import ru.gof.utils.showMessage

fun runStateDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----STATE-----")
    val startHumanActivity: HumanActivity = Sleeping()
    val developer: Developer = Developer(startHumanActivity)
    repeat(8) {
        developer.setHumanActivity()
        developer.justDoIt()
    }
}