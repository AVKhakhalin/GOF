package ru.gof.abstract_factory.projects.web

import ru.gof.abstract_factory.items.Developer
import ru.gof.abstract_factory.items.Manager
import ru.gof.abstract_factory.items.TeamProjectFactory
import ru.gof.abstract_factory.items.Tester

class WebTeamProjectFactory: TeamProjectFactory {
    override fun getDevelopers(numberEmployees: Int): List<Developer> {
        val developers: MutableList<Developer> = mutableListOf()
        repeat(numberEmployees) {
            developers.add(WebDeveloper())
        }
        return developers
    }

    override fun getTesters(numberEmployees: Int): List<Tester> {
        val testers: MutableList<Tester> = mutableListOf()
        repeat(numberEmployees) {
            testers.add(WebTester())
        }
        return testers
    }

    override fun getManagers(numberEmployees: Int): List<Manager> {
        val managers: MutableList<Manager> = mutableListOf()
        repeat(numberEmployees) {
            managers.add(WebManager())
        }
        return managers
    }
}