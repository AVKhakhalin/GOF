package ru.gof.behavioral.strategy.run

import ru.gof.behavioral.strategy.Coding
import ru.gof.behavioral.strategy.Developer
import ru.gof.behavioral.strategy.Eating
import ru.gof.behavioral.strategy.Reading
import ru.gof.behavioral.strategy.Sleeping
import ru.gof.utils.showMessage

fun runStrategyDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----STRATEGY-----")
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