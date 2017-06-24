package com.identity.dPatterns.chainOfResponsibility;

/**
 * Created by ajkumar on 5/1/17.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.logLevel = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("File Logger: " + msg);
    }
}
