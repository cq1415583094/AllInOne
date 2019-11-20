package com.hz;

public class Main {
    public static void main(String[] args) {
        //获取苹果工厂
        FruitFactory ff = new AppleFacory();
        //获取苹果对象
        Fruit apple = ff.getFruit();
        apple.get();

        //获取香蕉
        FruitFactory ff2 = new BananaFactory();
        Fruit banana = ff2.getFruit();
        banana.get();

        //获取梨子
        FruitFactory ff3 = new PearFactory();
        Fruit pear = ff3.getFruit();
        pear.get();
    }
}