package com.hz.pattern;

/**
 * 所有车装饰类的父类
 */
public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * 只要是车 肯定是可以跑的
     */
    @Override
    public void run() {
        System.out.println("车可以跑");
    }

    @Override
    public void show() {
        this.run();
    }

}