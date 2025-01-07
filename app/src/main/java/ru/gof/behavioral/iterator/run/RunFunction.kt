package ru.gof.behavioral.iterator.run

import ru.gof.behavioral.iterator.Developer
import ru.gof.behavioral.iterator.Iterator
import ru.gof.utils.showMessage

fun runIteratorDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----ITERATOR-----")
    val developer: Developer =
        Developer(
            name = "Андрей",
            skills = arrayListOf("Java", "Kotlin", "PHP", "SQL", "C++", "Groovy", "Mel", "Fortran")
        )
    val skillsIterator: Iterator = developer.getIterator()
    showMessage("Навыки разработчика \"${developer.getName()}\" по порядку возрастания их индекса:")
    while (skillsIterator.hasNext()) {
        showMessage("    ${skillsIterator.next().toString()}")
    }
    showMessage("Навыки разработчика \"${developer.getName()}\" по порядку убывания их индекса:")
    while (skillsIterator.hasPrevious()) {
        showMessage("    ${skillsIterator.previous().toString()}")
    }
}