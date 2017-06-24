package com.identity.dPatterns.chainOfResponsibility;

/**
 * Created by ajkumar on 5/1/17.
 */
public abstract class AbstractLogger {
    public static int   INFO = 1;
    public static int   DEBUG = 2;
    public static int   ERROR = 3;

    protected int logLevel;

    protected AbstractLogger nextLogger;

    //method used by
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String msg){
        if(logLevel <= level){
            write(msg);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, msg);
        }

    }

    abstract protected void write(String msg);

}
