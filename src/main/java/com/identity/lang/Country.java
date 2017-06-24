package com.identity.lang;

/**
 * Created by ajkumar on 5/3/17.
 */
public class Country implements Comparable<Country> {

    private int country_id = 0;
    private String country_name = "";

    public Country(int id, String name){
        this.country_id = id;
        this.country_name = name;
    }

    @Override
    public int compareTo(Country cntry) {
        return ((this.country_id > cntry.country_id) ? 1 : (this.country_id < cntry.country_id) ? -1 : 0);
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString(){
        return country_id + " : " + country_name ;
    }
}
