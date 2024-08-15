package ru.gof.singleton

import kotlin.concurrent.Volatile

class SingletonLogClassNull private constructor() {
    //region Поле, метод - глобальная точка входа - для класса-одиночки
    companion object {
        @Volatile
        var singletonLogClassNull: SingletonLogClassNull? = null
        fun getInstance() =
            singletonLogClassNull ?: synchronized(this) {
                singletonLogClassNull ?: SingletonLogClassNull().also {
                    singletonLogClassNull = it
                }
            }
    }
    //endregion

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