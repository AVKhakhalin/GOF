package ru.gof.proxy

import ru.gof.utils.showMessage

class RealProject(url: String): Project {
    init {
        showMessage(
            "Загрузка информации из ресурса $url для объекта класса ${this.javaClass.simpleName}"
        )
    }

    override fun run() {
        showMessage("Запущен проект в объекте классе ${this.javaClass.simpleName}")
    }
}