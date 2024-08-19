package ru.gof.composite.run

import ru.gof.composite.Developer
import ru.gof.composite.DevelopersRanks
import ru.gof.composite.ProductionTeam
import ru.gof.utils.showMessage

fun runCompositeDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----COMPOSITE----")
    val productionTeam: ProductionTeam = ProductionTeam()
    productionTeam.addDeveloper(Developer(DevelopersRanks.TEAM_LEAD, "Исмаилов Руслан"))
    productionTeam.addDeveloper(Developer(DevelopersRanks.JUNIOR_PLUS, "Жукова Татьяна"))
    productionTeam.addDeveloper(Developer(DevelopersRanks.STUDENT, "Кирьянов Илья"))
    productionTeam.addDeveloper(Developer(DevelopersRanks.MIDDLE_PLUS, "Рахатов Адель"))
    productionTeam.addDeveloper(Developer(DevelopersRanks.JUNIOR, "Иванов Иван"))
    productionTeam.addDeveloper(Developer(DevelopersRanks.MIDDLE, "Хахалин Андрей"))
    productionTeam.operation()

    showMessage(
        "Результат запроса по имени:\n${productionTeam.getDeveloperByName("Хахалин Андрей")}")
    showMessage(
        "Начинающие разработчики:\n${productionTeam.getBeginnerDevelopers(
            DevelopersRanks.JUNIOR_PLUS)}")
    showMessage(
        "Профессиональные разработчики:\n${productionTeam.getProfessionalsDevelopers(
            DevelopersRanks.MIDDLE)}")
    showMessage(
        "Заданный диапазон компетенций:\n${productionTeam.getDevelopersCustomsRange(
            DevelopersRanks.JUNIOR_PLUS, DevelopersRanks.MIDDLE_PLUS)}")
}