package ru.gof.strategy

import ru.gof.utils.showMessage

class Coding: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик пишет код.")
    }
}