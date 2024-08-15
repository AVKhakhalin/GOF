package ru.gof.singleton.not_gof_realization

import kotlin.concurrent.Volatile

class SingletonLogClassDoubleNullCheck private constructor() {
    //region Поле, метод - глобальная точка входа - для класса-одиночки
    companion object {
        @Volatile
        var singletonLogClassDoubleNullCheck: SingletonLogClassDoubleNullCheck? = null
        fun getInstance(): SingletonLogClassDoubleNullCheck {
            if (singletonLogClassDoubleNullCheck == null) {
                synchronized(this) {
                    if (singletonLogClassDoubleNullCheck == null) {
                        singletonLogClassDoubleNullCheck = SingletonLogClassDoubleNullCheck()
                    }
                }
            }
            // Вместо "return singletonLogClassDoubleNullCheck!!", чтобы отказаться от !!
            return singletonLogClassDoubleNullCheck ?: synchronized(this) {
                SingletonLogClassDoubleNullCheck().also {
                    singletonLogClassDoubleNullCheck = it
                }
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