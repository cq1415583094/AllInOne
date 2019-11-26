package com.hz.old;

public class FlyCar extends RunCar {
    @Override
    public void show() {
        super.show();
        this.fly();
    }

    public void fly() {
        System.out.println("车可以飞");
    }
}