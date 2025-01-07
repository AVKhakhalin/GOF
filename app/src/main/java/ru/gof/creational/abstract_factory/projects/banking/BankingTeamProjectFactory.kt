package ru.gof.creational.abstract_factory.projects.banking

class BankingTeamProjectFactory: ru.gof.creational.abstract_factory.items.TeamProjectFactory {
    override fun getDevelopers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Developer> {
        val developers: MutableList<ru.gof.creational.abstract_factory.items.Developer> = mutableListOf()
        repeat(numberEmployees) {
            developers.add(ru.gof.creational.abstract_factory.projects.banking.BankingDeveloper())
        }
        return developers
    }

    override fun getTesters(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Tester> {
        val testers: MutableList<ru.gof.creational.abstract_factory.items.Tester> = mutableListOf()
        repeat(numberEmployees) {
            testers.add(BankingTester())
        }
        return testers
    }

    override fun getManagers(numberEmployees: Int): List<ru.gof.creational.abstract_factory.items.Manager> {
        val managers: MutableList<ru.gof.creational.abstract_factory.items.Manager> = mutableListOf()
        repeat(numberEmployees) {
            managers.add(BankingManager())
        }
        return managers
    }
}