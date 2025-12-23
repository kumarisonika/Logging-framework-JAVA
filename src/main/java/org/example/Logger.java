package org.example;

public class Logger {
    void log(LogLevel level, String message){
        System.out.println(level + " : " + message);
    }

    void info(String message){
        log(LogLevel.INFO, message);
    }

    void error(String message){
        log(LogLevel.ERROR, message);
    }
}
