package ru.gof.behavioral.iterator

class Developer(
    private var name: String,
    private var skills: ArrayList<String>,
): Collection {

    fun setName(newName: String) {
        name = newName
    }
    fun getName() = name

    fun setSkills(newSkills: ArrayList<String>) {
        skills = newSkills
    }
    fun getSkills() = skills

    override fun getIterator(): Iterator = skillsIterator()

    private inner class skillsIterator: Iterator {
        private var index: Int = 0

        override fun hasNext(): Boolean {
            return ((skills.size > 0) && (index < skills.size))
        }

        override fun hasPrevious(): Boolean {
            return index > 0
        }

        override fun next(): Any? {
            return (if (hasNext()) {
                skills[index++]
            } else {
                null
            })
        }

        override fun previous(): Any? {
            return (if (hasPrevious()) {
                skills[--index]
            } else {
                null
            })
        }
    }
}