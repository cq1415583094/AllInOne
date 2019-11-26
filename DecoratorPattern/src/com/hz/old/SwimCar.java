package com.hz.old;

public class SwimCar extends RunCar {

    @Override
    public void show() {
        super.show();
        this.swim();
    }

    public void swim() {
        System.out.println("车可以游");
    }
}