package ru.gof.behavioral.state

import ru.gof.utils.showMessage

class Eating: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик кушает.")
    }
}