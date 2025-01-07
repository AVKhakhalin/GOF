package ru.gof.creational.singleton.not_gof_realization

class SingletonClass private constructor() {
    //region Поле - точка входа - для класса-одиночки
    companion object {
        val instance: SingletonClass = SingletonClass()
    }

    //region Поле и методы для примера функциональности класса-одиночки
    private var textLog: String = "Лог класса ${this.javaClass.simpleName}"
    fun writeLog(text: String) {
        textLog += "\n$text"
    }
    fun showLog(): String {
        return textLog
    }
    //endregion
}