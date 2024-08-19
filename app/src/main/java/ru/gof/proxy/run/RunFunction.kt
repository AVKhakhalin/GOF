package ru.gof.proxy.run

import ru.gof.proxy.ProxyProject
import ru.gof.utils.showMessage

fun runProxyDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----PROXY----")
    val proxyProject: ProxyProject = ProxyProject("https://github.com/AVKhakhalin/GOF")
    proxyProject.run()
}