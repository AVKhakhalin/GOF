package ru.gof.singleton.not_gof_realization;

public class SingletonClassJava {
    public String testField = "";
    private SingletonClassJava() {}

    private static final class SingletonClassJavaHolder {
        public static SingletonClassJava instance = new SingletonClassJava();
    }

    public static SingletonClassJava getInstance() {
        return SingletonClassJavaHolder.instance;
    }

    @Override
    public String toString() {
        return "SingletonClassJava{" +
                "testText='" + testField + '\'' +
                '}';
    }
}
