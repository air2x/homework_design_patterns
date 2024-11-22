package ru.maxima.singelton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String timestamp = new SimpleDateFormat("dd.MM.yy").format(new Date());
        System.out.println("Log info: " + timestamp + " - " + className + " - " + info);
    }
}
