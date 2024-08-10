package ru.gof.abstract_factory.projects.banking

import ru.gof.abstract_factory.items.Developer
import ru.gof.abstract_factory.items.Manager
import ru.gof.abstract_factory.items.TeamProjectFactory
import ru.gof.abstract_factory.items.Tester

class BankingTeamProjectFactory: TeamProjectFactory {
    override fun getDevelopers(numberEmployees: Int): List<Developer> {
        val developers: MutableList<Developer> = mutableListOf()
        repeat(numberEmployees) {
            developers.add(BankingDeveloper())
        }
        return developers
    }

    override fun getTesters(numberEmployees: Int): List<Tester> {
        val testers: MutableList<Tester> = mutableListOf()
        repeat(numberEmployees) {
            testers.add(BankingTester())
        }
        return testers
    }

    override fun getManagers(numberEmployees: Int): List<Manager> {
        val managers: MutableList<Manager> = mutableListOf()
        repeat(numberEmployees) {
            managers.add(BankingManager())
        }
        return managers
    }
}