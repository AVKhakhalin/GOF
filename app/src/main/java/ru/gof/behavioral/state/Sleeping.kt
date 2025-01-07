package ru.gof.behavioral.state

import ru.gof.utils.showMessage

class Sleeping: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик спит.")
    }
}