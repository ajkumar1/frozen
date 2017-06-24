package com.identity.enums;

/**
 * Created by ajkumar on 4/27/17.
 */
public enum Days {
    SUN("SUN", "SUNDAY"),
    MON("MON","MONDAY"),
    TUE("TUE","TUESDAY"),
    WED("WED","WEDNESDAY"),
    THU("THU", "THURSDAY"),
    FRI("FRI", "FRIDAY"),
    SAT("SAT", "SATURDAY");

    private  String shortName = null;
    private  String fullName = null;

    private Days(String shortName, String fullName){
        this.shortName = shortName;
        this.fullName = fullName;
    }

    @Override
    public String toString(){
        return fullName;
    }

}
