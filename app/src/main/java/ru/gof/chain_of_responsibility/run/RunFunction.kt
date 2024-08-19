package ru.gof.chain_of_responsibility.run

import ru.gof.chain_of_responsibility.Message
import ru.gof.chain_of_responsibility.NotifierImplMMS
import ru.gof.chain_of_responsibility.NotifierImplSMS
import ru.gof.chain_of_responsibility.NotifierImplServer
import ru.gof.chain_of_responsibility.Priority
import ru.gof.utils.showMessage

fun runChainOfResponsibilityDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----CHAIN OF RESPONSIBILITY----")
    val notifierImplSMS: NotifierImplSMS = NotifierImplSMS(Priority.LOW)
    val notifierImplMMS: NotifierImplMMS = NotifierImplMMS(Priority.NORMAL).also {
        notifierImplSMS.setNotifier(it)
    }
    val notifierImplServer: NotifierImplServer = NotifierImplServer(Priority.HIGH).also {
        notifierImplMMS.setNotifier(it)
    }
    notifierImplSMS.notifyManager(
        Message("Сообщение о лёгкой неисправности", Priority.LOW)
    )
    notifierImplSMS.notifyManager(
        Message("Сообщение о средней неисправности", Priority.NORMAL)
    )
    notifierImplSMS.notifyManager(
        Message("Сообщение о тяжёлой неисправности", Priority.HIGH)
    )
}