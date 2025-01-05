package ru.gof.memento

class GitHubRepo {
    private val projectCommits: MutableMap<String, Save> = mutableMapOf()

    // Запись коммита в репозиторий
    fun pushCommit(save: Save) {
        projectCommits[save.version] = save
    }

    // Загрузка коммита из репозитория
    fun fetchCommit(version: String): Save? {
        return projectCommits[version]
    }
}