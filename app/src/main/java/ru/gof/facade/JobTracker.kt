package ru.gof.facade

import ru.gof.utils.showMessage

class JobTracker(val job: Job) {
    private var isJobStart: Boolean = false // false - работа не начата; true - работа начата

    // Метод для получения текущего состояния работы
    fun getJobStaus(): Job? {
        return if (isJobStart) {
            job
        } else {
            null
        }
    }

    // Метод для старта работы
    fun startJob() {
        if (isJobStart) {
            showMessage("Работа \"${job.getJobName()}\" продолжается...")
        } else {
            isJobStart = true
            showMessage("Работа \"${job.getJobName()}\" началась...")
        }
    }

    // Метод для завершения работы
    fun stopJob() {
        isJobStart = false
        showMessage("Работа \"${job.getJobName()}\" завершилась.")
    }
}