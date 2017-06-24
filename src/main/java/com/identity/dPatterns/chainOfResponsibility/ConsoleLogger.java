package com.identity.dPatterns.chainOfResponsibility;

/**
 * Created by ajkumar on 5/1/17.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        logLevel = level;
    }
    @Override
    protected void write(String msg) {
        System.out.println("Console Logger: " + msg);
    }
}
