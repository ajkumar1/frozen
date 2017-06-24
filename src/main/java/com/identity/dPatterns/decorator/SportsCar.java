package com.identity.dPatterns.decorator;

/**
 * Created by ajkumar on 4/30/17.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assembleCar(){
        super.assembleCar();
        System.out.println("Adding features of Sports Car");
    }
}
