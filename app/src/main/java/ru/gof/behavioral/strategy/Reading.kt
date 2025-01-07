package ru.gof.behavioral.strategy

import ru.gof.utils.showMessage

class Reading: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик читает книгу.")
    }
}