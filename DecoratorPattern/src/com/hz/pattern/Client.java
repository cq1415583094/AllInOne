package com.hz.pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("----- 下面这辆车只有基本功能 -------");
        Car runCar = new RunCar();
        runCar.show();

        System.out.println("------ 将上面的车扩展为可飞 -------");

        Car flyCar = new FlyCarDecorator(runCar);
        flyCar.show();

        System.out.println("------ 将可以飞的车再次扩展为可游 -------");

        Car flyAndSwimCar = new SwimCarDecorator(flyCar);
        flyAndSwimCar.show();

        //若对可飞可游的车再次升级时，只需要增加相应的装饰器类并将之前装饰好的车升级
    }
}