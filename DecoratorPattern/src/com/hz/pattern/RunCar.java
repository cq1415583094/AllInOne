package com.hz.pattern;

public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("车可以跑");
    }

    @Override
    public void show() {
        this.run();
    }
}