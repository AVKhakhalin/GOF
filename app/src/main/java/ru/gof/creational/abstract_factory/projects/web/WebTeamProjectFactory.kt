package ru.gof.creational.abstract_factory.projects.web

class WebTeamProjectFactory: ru.gof.creational.abstract_factory.items.TeamProjectFactory {
    override fun getDevelopers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Developer> {
        val developers: MutableList<ru.gof.creational.abstract_factory.items.Developer> = mutableListOf()
        repeat(numberEmployees) {
            developers.add(WebDeveloper())
        }
        return developers
    }

    override fun getTesters(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Tester> {
        val testers: MutableList<ru.gof.creational.abstract_factory.items.Tester> = mutableListOf()
        repeat(numberEmployees) {
            testers.add(WebTester())
        }
        return testers
    }

    override fun getManagers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Manager> {
        val managers: MutableList<ru.gof.creational.abstract_factory.items.Manager> = mutableListOf()
        repeat(numberEmployees) {
            managers.add(WebManager())
        }
        return managers
    }
}