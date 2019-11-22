package com.hz;

/**
 * 苹果工厂
 */
public class AppleFacory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}