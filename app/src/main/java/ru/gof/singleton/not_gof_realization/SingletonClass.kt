package ru.gof.singleton.not_gof_realization

class SingletonClass private constructor() {
    var testField: String = ""
    companion object {
        val instance: SingletonClass = SingletonClass()
    }

    override fun toString(): String {
        return "SingletonClass(testField='$testField')"
    }
}