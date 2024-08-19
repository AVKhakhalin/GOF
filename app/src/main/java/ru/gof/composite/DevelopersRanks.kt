package ru.gof.composite

enum class DevelopersRanks {
    STUDENT,
    JUNIOR,
    JUNIOR_PLUS,
    MIDDLE,
    MIDDLE_PLUS,
    SENIOR,
    TEAM_LEAD,
    UNKNOWN_TYPE,
}

fun converterIntToDevelopersRanks(developerRankInt: Int): DevelopersRanks {
    return when(developerRankInt) {
        0 -> DevelopersRanks.STUDENT
        1 -> DevelopersRanks.JUNIOR
        2 -> DevelopersRanks.JUNIOR_PLUS
        3 -> DevelopersRanks.MIDDLE
        4 -> DevelopersRanks.MIDDLE_PLUS
        5 -> DevelopersRanks.SENIOR
        6 -> DevelopersRanks.TEAM_LEAD
        else -> DevelopersRanks.UNKNOWN_TYPE
    }
}