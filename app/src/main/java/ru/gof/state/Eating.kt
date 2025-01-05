package ru.gof.state

import ru.gof.utils.showMessage

class Eating: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик кушает.")
    }
}