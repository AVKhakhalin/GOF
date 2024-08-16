package ru.gof.observer

import ru.gof.utils.showMessage

class Developer(
    private val name: String,
): Observer {
    override fun handleEvent(listVacancies: List<String>) {
        showMessage(
            "${this.javaClass.simpleName}: Для $name есть новая информация о вакансиях:" +
            "\n$listVacancies\n-------------\n"
        )
    }
}