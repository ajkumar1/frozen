package com.identity.dPatterns.decorator;

/**
 * Created by ajkumar on 4/30/17.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public void assembleCar() {
        this.car.assembleCar();
    }
}
