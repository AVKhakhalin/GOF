package ru.gof.singleton.run

import ru.gof.singleton.SingletonLogClassJava
import ru.gof.singleton.SingletonLogClassNull
import ru.gof.singleton.not_gof_realization.SingletonClass
import ru.gof.singleton.not_gof_realization.SingletonClassJava
import ru.gof.singleton.not_gof_realization.SingletonLogClassByLazy
import ru.gof.singleton.not_gof_realization.SingletonLogClassDoubleNullCheck
import ru.gof.singleton.not_gof_realization.SingletonLogClassEnum
import ru.gof.singleton.not_gof_realization.SingletonLogClassObject
import ru.gof.utils.showMessage

fun runSingletonRunner() {
    showMessage("")
    showMessage("")
    showMessage("-----SINGLETON----")
    //region Not GOF realisation
    showMessage("       NOT GOF REALISATION:")
    SingletonClassJava.getInstance().writeLog("first")
    SingletonClassJava.getInstance().writeLog("second")
    SingletonClassJava.getInstance().writeLog("third")
    SingletonClassJava.getInstance().writeLog("forth")
    showMessage(SingletonClassJava.getInstance().showLog())

    SingletonClass.instance.writeLog("first")
    SingletonClass.instance.writeLog("second")
    SingletonClass.instance.writeLog("third")
    SingletonClass.instance.writeLog("forth")
    showMessage(SingletonClass.instance.showLog())

    SingletonLogClassByLazy.instance.writeLog("first")
    SingletonLogClassByLazy.instance.writeLog("second")
    SingletonLogClassByLazy.instance.writeLog("third")
    SingletonLogClassByLazy.instance.writeLog("forth")
    showMessage(SingletonLogClassByLazy.instance.showLogText())

    SingletonLogClassObject.writeLog("first")
    SingletonLogClassObject.writeLog("second")
    SingletonLogClassObject.writeLog("third")
    SingletonLogClassObject.writeLog("forth")
    showMessage(SingletonLogClassObject.showLogText())

    SingletonLogClassDoubleNullCheck.getInstance().writeLog("first")
    SingletonLogClassDoubleNullCheck.getInstance().writeLog("second")
    SingletonLogClassDoubleNullCheck.getInstance().writeLog("third")
    SingletonLogClassDoubleNullCheck.getInstance().writeLog("forth")
    showMessage(SingletonLogClassDoubleNullCheck.getInstance().showLogText())

    SingletonLogClassEnum.LOG_CLASS.writeLog("first")
    SingletonLogClassEnum.LOG_CLASS.writeLog("second")
    SingletonLogClassEnum.LOG_CLASS.writeLog("third")
    SingletonLogClassEnum.LOG_CLASS.writeLog("forth")
    showMessage(SingletonLogClassEnum.LOG_CLASS.showLogText())
    //endregion

    //region GOF realisation
    showMessage("       GOF REALISATION:")
    SingletonLogClassJava.getInstance().writeLog("first")
    SingletonLogClassJava.getInstance().writeLog("second")
    SingletonLogClassJava.getInstance().writeLog("third")
    SingletonLogClassJava.getInstance().writeLog("forth")
    showMessage(SingletonLogClassJava.getInstance().showLogInfo())

    SingletonLogClassNull.getInstance().writeLog("first")
    SingletonLogClassNull.getInstance().writeLog("second")
    SingletonLogClassNull.getInstance().writeLog("third")
    SingletonLogClassNull.getInstance().writeLog("forth")
    showMessage(SingletonLogClassNull.getInstance().showLogText())
    //endregion
}