package ru.gof.structural.facade

import ru.gof.utils.showMessage

class Developer {
    // Функция для получения информации о текущей работе разработчика
    fun doDeveloperJob(jobTracker: JobTracker) {
        val job: Job? = jobTracker.getJobStaus()
        if (job != null) {
            showMessage("Разработчик выполняет работу \"${job.getJobName()}\".")
        } else {
            showMessage("Разработчик занимается саморазвитием.")
        }
    }
}