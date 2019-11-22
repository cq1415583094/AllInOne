package com.hz;

public class Main {

    public static void main(String[] args) {
        FruitFactory guangDongFruitFactory = new GuangDongFruitFactory();
        Fruit apple = guangDongFruitFactory.getApple();
        apple.get();

        Fruit banana = guangDongFruitFactory.getBanana();
        banana.get();


        FruitFactory guangXiFruitFactory = new GuangXiFruitFactory();
        Fruit apple1 = guangXiFruitFactory.getApple();
        apple1.get();

        Fruit banana1 = guangXiFruitFactory.getBanana();
        banana1.get();
    }
}