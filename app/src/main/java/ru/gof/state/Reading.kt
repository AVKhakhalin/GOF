package ru.gof.state

import ru.gof.utils.showMessage

class Reading: HumanActivity {
    override fun justDoIt() {
        showMessage("Разработчик читает книгу.")
    }
}