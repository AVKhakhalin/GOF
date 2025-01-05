package ru.gof.state

class Developer(
    private var humanActivity: HumanActivity
) {
    fun setHumanActivity() {
        when(humanActivity) {
            is Sleeping -> humanActivity = Eating()
            is Eating -> humanActivity = Coding()
            is Coding -> humanActivity = Reading()
            is Reading -> humanActivity = Sleeping()
        }
    }

    fun justDoIt() {
        humanActivity.justDoIt()
    }
}