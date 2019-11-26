package com.hz.old;

public class Client {
    public static void main(String[] args) {
        Car car1 = new RunCar();
        car1.show();

        System.out.println("----------");

        Car car2 = new FlyCar();
        car2.show();

        System.out.println("----------");

        Car car3 = new SwimCar();
        car3.show();

        //问题：使用继承每进行一次扩展都需要添加一个子类，若此时，我们需要增加一个可跑、可飞、可游、。。。的车那需要实现很多方法而且多个子类之间存在重贴
        //      此时，装饰模式的好处即可体现
    }
}