package ru.gof.strategy.run

import ru.gof.strategy.Coding
import ru.gof.strategy.Developer
import ru.gof.strategy.Eating
import ru.gof.strategy.Reading
import ru.gof.strategy.Sleeping
import ru.gof.utils.showMessage

fun runStrategyDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----STRATEGY----")
    val developer: Developer = Developer(Sleeping())
    developer.executeHumanActivity()
    developer.setHumanActivity(Eating())
    developer.executeHumanActivity()
    developer.setHumanActivity(Coding())
    developer.executeHumanActivity()
    developer.setHumanActivity(Reading())
    developer.executeHumanActivity()
    developer.setHumanActivity(Sleeping())
    developer.executeHumanActivity()
}