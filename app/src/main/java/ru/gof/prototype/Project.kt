package ru.gof.prototype

class Project(
    var id: Int,
    var name: String,
    var data: String,
): ClonePrototype {
    override fun clonePrototype(): Any {
        return Project(id, name, data)
    }

    override fun toString(): String {
        return "${this.javaClass.simpleName}: $id, $name, $data"
    }
}