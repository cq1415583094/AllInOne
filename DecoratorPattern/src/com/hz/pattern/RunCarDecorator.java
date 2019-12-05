package com.hz.pattern;

/**
 * 只可以跑的车的装饰类
 * 可以不需要
 */
public class RunCarDecorator extends CarDecorator {
    public RunCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        System.out.println("车可以跑");
    }

    @Override
    public void show() {
        this.getCar().show();
        this.run();
    }
}