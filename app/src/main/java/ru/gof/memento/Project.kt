package ru.gof.memento

import java.util.Date

class Project(
    private var name: String,
    private var version: String,
) {
    private var dateTime: Long = Date().time

    fun setNameVersionDate(newName: String = name,
                           newVersion: String,
    ) {
        name = newName
        version = newVersion
        dateTime = Date().time
    }

    fun saveProject(): Save =
        Save(
            name = name,
            version = version,
            dateTime = dateTime
        )

    fun loadProject(save: Save?) {
        save?.let {
            name = save.name
            version = save.version
            dateTime = save.dateTime
        }
    }

    override fun toString(): String {
        return "Project(name=\"$name\", version=\"$version\", dateTime=$dateTime)"
    }
}