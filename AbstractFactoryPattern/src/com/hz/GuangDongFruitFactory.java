package com.hz;

/**
 * 广东水果工厂
 */
public class GuangDongFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new GuangDongApple();
    }

    @Override
    public Fruit getBanana() {
        return new GuangDongBanana();
    }
}