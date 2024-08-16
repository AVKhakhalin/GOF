package ru.gof.observer

class DeveloperVacancies: Observed {
    //region Блок логики источника информации
    private val vacancies: MutableList<String> = mutableListOf()
    fun addVacancy(newVacancy: String) {
        vacancies.add(newVacancy)
        notifyAllObservers()
    }
    fun removeVacancy(vacancy: String) {
        vacancies.remove(vacancy)
        notifyAllObservers()
    }
    //endregion

    //region Блок для наблюдения
    private val observers: MutableList<Observer> = mutableListOf()
    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }
    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }
    override fun notifyAllObservers() {
        observers.forEach {
            it.handleEvent(vacancies)
        }
    }
    //endregion
}