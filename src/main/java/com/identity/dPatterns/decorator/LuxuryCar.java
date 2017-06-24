package com.identity.dPatterns.decorator;

/**
 * Created by ajkumar on 4/30/17.
 */
public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assembleCar(){
        super.assembleCar();
        System.out.println("Adding features of Luxury Car");
    }
}
