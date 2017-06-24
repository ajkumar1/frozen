package com.identity.jackson;

/**
 * Created by ajkumar on 5/2/17.
 */
public class Address {
    private String street;
    private String city;
    private int zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zip) {
        this.zipcode = zip;
    }

    @Override
    public String toString(){
        return getStreet() + ", "+getCity()+", "+getZipcode();
    }
}
