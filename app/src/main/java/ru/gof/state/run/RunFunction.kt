package ru.gof.state.run

import ru.gof.state.Developer
import ru.gof.state.HumanActivity
import ru.gof.state.Sleeping
import ru.gof.utils.showMessage

fun runStateDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----STATE----")
    val startHumanActivity: HumanActivity = Sleeping()
    val developer: Developer = Developer(startHumanActivity)
    repeat(8) {
        developer.setHumanActivity()
        developer.justDoIt()
    }
}