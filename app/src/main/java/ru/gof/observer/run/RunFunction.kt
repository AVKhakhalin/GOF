package ru.gof.observer.run

import ru.gof.observer.Developer
import ru.gof.observer.DeveloperVacancies
import ru.gof.utils.showMessage

val PHP_VACANCY_NAME: String = "Новая вакансия по PHP"
val KOTLIN_VACANCY_NAME: String = "Новая вакансия по Kotlin"
val JAVA_VACANCY_NAME: String = "Новая вакансия по Java"

fun runObserverDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----OBSERVER----")
    // Создание источника информации
    val developerVacancies: DeveloperVacancies = DeveloperVacancies()
    // Проверка добавления вакансии без прикреплённых наблюдателей
    developerVacancies.addVacancy(PHP_VACANCY_NAME)
    // Создание наблюдателей
    val developerKotlin: Developer = Developer("Хахалин Андрей Владимирович")
    val developerJava: Developer = Developer("Иванов Иван Иванович")
    // Проверка добавления наблюдателей
    developerVacancies.addObserver(developerKotlin)
    developerVacancies.addObserver(developerJava)
    // Проверка добавления вакансий
    developerVacancies.addVacancy(KOTLIN_VACANCY_NAME)
    developerVacancies.addVacancy(JAVA_VACANCY_NAME)
    // Проверка удаления вакансий
    developerVacancies.removeVacancy(PHP_VACANCY_NAME)
    developerVacancies.removeVacancy(KOTLIN_VACANCY_NAME)
    developerVacancies.removeVacancy(JAVA_VACANCY_NAME)
}