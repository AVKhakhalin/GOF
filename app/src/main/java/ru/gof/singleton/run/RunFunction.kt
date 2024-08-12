package ru.gof.singleton.run

import ru.gof.singleton.not_gof_realization.SingletonClass
import ru.gof.singleton.not_gof_realization.SingletonClassJava
import ru.gof.utils.showMessage

fun runSingletonRunner() {
    showMessage("")
    showMessage("")
    showMessage("-----SINGLETON----")
    val singletonClassJava: SingletonClassJava = SingletonClassJava.getInstance()
    singletonClassJava.testField = "test 1"
    val singletonClassJavaNext: SingletonClassJava = SingletonClassJava.getInstance()
    showMessage(singletonClassJava.toString())
    showMessage(singletonClassJavaNext.toString())
    showMessage("")
    val singletonClass: SingletonClass = SingletonClass.instance
    singletonClass.testField = "test 2"
    val singletonClassNext: SingletonClass = SingletonClass.instance
    showMessage(singletonClass.toString())
    showMessage(singletonClassNext.toString())
}