package ru.gof.structural.proxy.run

import ru.gof.structural.proxy.ProxyProject
import ru.gof.utils.showMessage

fun runProxyDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----PROXY-----")
    val proxyProject: ProxyProject = ProxyProject("https://github.com/AVKhakhalin/GOF")
    proxyProject.run()
}