package com.hz.old;

public class Client {
    public static void main(String[] args) {
        Car bus1 = new Bus2000();
        bus1.installEngine();

        Car bus2 = new Bus2200();
        bus2.installEngine();

        Car jeep = new Jeep2000();
        jeep.installEngine();

        //此时不管是引擎还是汽车类型，每增加一种类的数量都是呈指数级增长的，不可取
    }
}