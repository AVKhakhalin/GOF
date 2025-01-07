package ru.gof.behavioral.strategy

class Developer(
    private var humanActivity: HumanActivity,
) {
    fun setHumanActivity(newHumanActivity: HumanActivity) {
        humanActivity = newHumanActivity
    }

    fun executeHumanActivity() {
        humanActivity.justDoIt()
    }
}