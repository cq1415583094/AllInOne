package com.hz.pattern;

/**
 * 可以飞的车
 */
public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    public void fly() {
        System.out.println("车可以飞");
    }

    @Override
    public void show() {
        this.getCar().show();
        fly();
    }
}