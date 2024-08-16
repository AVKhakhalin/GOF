package ru.gof.proxy

import ru.gof.utils.showMessage

class ProxyProject(private val url: String): Project {
    init {
        showMessage("Создан прокси-объект ${this.javaClass.simpleName}")
    }

    private var realProject: RealProject? = null

    override fun run() {
        if (realProject == null) {
            realProject = RealProject(url)
        }
        realProject?.run()
    }
}