package com.hz;

/**
 * 汽车抽象类
 * 包含一个汽车引擎的引用
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public abstract void installEngine();
}