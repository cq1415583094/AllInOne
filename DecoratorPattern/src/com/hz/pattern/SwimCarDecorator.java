package com.hz.pattern;

/**
 * 可以游的车
 */
public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    public void swim() {
        System.out.println("车可以游");
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }
}