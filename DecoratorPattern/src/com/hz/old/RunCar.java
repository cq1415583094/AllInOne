package com.hz.old;

class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    public void run() {
        System.out.println("车可以跑");
    }
}