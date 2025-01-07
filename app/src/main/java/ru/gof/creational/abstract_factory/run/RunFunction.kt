package ru.gof.creational.abstract_factory.run

import ru.gof.creational.abstract_factory.projects.banking.BankingTeamProjectFactory
import ru.gof.creational.abstract_factory.projects.web.WebTeamProjectFactory
import ru.gof.utils.showMessage

fun runAbstractFactoryDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----ABSTRACT FACTORY-----")
    val bankingTeamProjectFactory: ru.gof.creational.abstract_factory.items.TeamProjectFactory =
        BankingTeamProjectFactory()
    val bankingDevelopers: List<ru.gof.creational.abstract_factory.items.Developer> =
        bankingTeamProjectFactory.getDevelopers(10).onEach { developer ->
            developer.writingCode()
        }
    val bankingTesters: List<ru.gof.creational.abstract_factory.items.Tester> =
        bankingTeamProjectFactory.getTesters(3).onEach { tester ->
            tester.testingCode()
        }
    val bankingManagers: List<ru.gof.creational.abstract_factory.items.Manager> =
        bankingTeamProjectFactory.getManagers(2).onEach { manager ->
            manager.managingProject()
        }

    val webTeamProjectFactory: ru.gof.creational.abstract_factory.items.TeamProjectFactory =
        WebTeamProjectFactory()
    val webDevelopers: List<ru.gof.creational.abstract_factory.items.Developer> =
        webTeamProjectFactory.getDevelopers(3).onEach { developer ->
            developer.writingCode()
        }
    val webTesters: List<ru.gof.creational.abstract_factory.items.Tester> =
        webTeamProjectFactory.getTesters(1).onEach { tester ->
            tester.testingCode()
        }
    val webManagers: List<ru.gof.creational.abstract_factory.items.Manager> =
        webTeamProjectFactory.getManagers(1).onEach { manager ->
            manager.managingProject()
        }
}