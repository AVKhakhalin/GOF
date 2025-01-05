package ru.gof.strategy

import ru.gof.utils.showMessage

class Sleeping: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик спит.")
    }
}