package ru.gof.facade

import ru.gof.utils.showMessage

class Job(private val jobName: String) {
    // Функция для получения названия работы
    fun getJobName() = jobName

    // Функция для начала выполнения работы
    fun doJob() {
        showMessage("Название текущей работы \"$jobName\"")
    }
}