package com.hz;

/**
 * 广西水果工厂
 */
public class GuangXiFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new GuangXiApple();
    }

    @Override
    public Fruit getBanana() {
        return new GuangXiBanana();
    }
}