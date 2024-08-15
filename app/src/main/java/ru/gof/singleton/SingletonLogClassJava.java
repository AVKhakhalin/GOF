package ru.gof.singleton;

public class SingletonLogClassJava {
    //region Поле, конструктор и метод - глобальная точка входа - для класса-одиночки
    private static SingletonLogClassJava singletonLogClassJava;
    private SingletonLogClassJava() {}
    public static synchronized SingletonLogClassJava getInstance() {
        if (singletonLogClassJava == null) {
            singletonLogClassJava = new SingletonLogClassJava();
        }
        return singletonLogClassJava;
    }
    //endregion

    //region Поле и методы для примера функциональности класса-одиночки
    private String logText = "Лог класса " + this.getClass().getSimpleName();
    public void writeLog(String text) {
        logText += '\n' + text;
    }
    public String showLogInfo() {
        return logText;
    }
    //endregion
}
