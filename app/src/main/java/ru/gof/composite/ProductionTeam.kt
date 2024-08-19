package ru.gof.composite

import ru.gof.utils.showMessage
import java.util.TreeMap

class ProductionTeam: DevelopersTeam {
    private val treeOfDevelopers: TreeMap<Int, String> = TreeMap()
    override fun operation() {
        showMessage("${this.javaClass.simpleName} состоит из следующих разработчиков:")
        treeOfDevelopers.forEach {
            showMessage("${it.value}, ранг ${converterIntToDevelopersRanks(it.key)}")
        }
    }

    override fun addDeveloper(developer: Developer) {
        treeOfDevelopers[developer.rank.ordinal] = developer.name
    }

    override fun getDeveloperByName(name: String): Developer? {
        treeOfDevelopers.forEach {
            if (it.value == name) {
                return Developer(converterIntToDevelopersRanks(it.key), it.value)
            }
        }
        return null
    }

    override fun getBeginnerDevelopers(maxRank: DevelopersRanks): List<Developer> {
        return treeOfDevelopers.headMap(maxRank.ordinal).map { Developer(
            converterIntToDevelopersRanks(it.key), it.value) }.toList()
    }

    override fun getProfessionalsDevelopers(minRank: DevelopersRanks): List<Developer> {
        return treeOfDevelopers.tailMap(minRank.ordinal).map { Developer(
            converterIntToDevelopersRanks(it.key), it.value) }.toList()
    }

    override fun getDevelopersCustomsRange(
        minRank: DevelopersRanks,
        maxRank: DevelopersRanks
    ): List<Developer> {
        return treeOfDevelopers.subMap(minRank.ordinal, maxRank.ordinal).map { Developer(
            converterIntToDevelopersRanks(it.key), it.value) }.toList()
    }
}