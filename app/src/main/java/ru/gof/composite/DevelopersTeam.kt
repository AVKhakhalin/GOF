package ru.gof.composite

interface DevelopersTeam {
    fun operation()

    fun addDeveloper(developer: Developer)
    fun getDeveloperByName(name: String): Developer?
    fun getBeginnerDevelopers(maxRank: DevelopersRanks): List<Developer>
    fun getProfessionalsDevelopers(minRank: DevelopersRanks): List<Developer>
    fun getDevelopersCustomsRange(
        minRank: DevelopersRanks, maxRank: DevelopersRanks): List<Developer>
}