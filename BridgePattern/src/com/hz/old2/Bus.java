package com.hz.old2;

public class Bus implements Car {
    @Override
    public void installEngine2000() {
        System.out.println("Bus安装2000cc引擎");
    }

    @Override
    public void installEngine2200() {
        System.out.println("Bus安装2200cc引擎");
    }
}