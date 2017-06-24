package com.identity.dPatterns.chainOfResponsibility;

/**
 * Created by ajkumar on 5/1/17.
 */
public class ErrorLogger extends AbstractLogger {
   public ErrorLogger(int level){
       this.logLevel = level;
   }

    @Override
    protected void write(String msg) {
        System.out.println("Error Logger: " + msg);
    }
}
