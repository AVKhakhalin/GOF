package ru.gof.singleton.not_gof_realization;

public class SingletonClassJava {
    //region Поле, конструктор и метод - глобальная точка входа - для класса-одиночки
    private static final class SingletonClassJavaHolder {
        public static SingletonClassJava instance = new SingletonClassJava();
    }
    private SingletonClassJava() {}
    public static SingletonClassJava getInstance() {
        return SingletonClassJavaHolder.instance;
    }
    //endregion

    //region Поле и методы для примера функциональности класса-одиночки
    private String textLog = "Лог класса " + this.getClass().getSimpleName();
    public void writeLog(String text) {
        textLog += '\n' + text;
    }
    public String showLog() {
        return textLog;
    }
    //endregion
}
