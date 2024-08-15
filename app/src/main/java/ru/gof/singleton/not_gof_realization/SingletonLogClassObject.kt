package ru.gof.singleton.not_gof_realization

object SingletonLogClassObject {
    //region Поле и методы для примера функциональности класса-одиночки
    private var textLog: String = "Лог класса ${this.javaClass.simpleName}"
    fun writeLog(text: String) {
        textLog += "\n$text"
    }
    fun showLogText(): String {
        return textLog
    }
    //endregion
}