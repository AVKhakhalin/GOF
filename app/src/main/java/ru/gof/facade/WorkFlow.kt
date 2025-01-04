package ru.gof.facade

class WorkFlow(private val jobName: String) {
    private val job: Job = Job(jobName)
    private val jobTracker: JobTracker = JobTracker(job)
    private val developer: Developer = Developer()

    // Функция для начала работы
    fun startJob() {
        if (jobTracker.getJobStaus() == null) {
            job.doJob()
            jobTracker.startJob()
            developer.doDeveloperJob(jobTracker)
        } else {
            jobTracker.startJob()
        }
    }

    // Функция для остановки работы
    fun stopJob() {
        jobTracker.stopJob()
        developer.doDeveloperJob(jobTracker)
    }
}