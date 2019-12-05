package com.hz.old2;

public class Client {
    public static void main(String[] args) {
        Car bus = new Bus();
        bus.installEngine2000();
        bus.installEngine2200();

        Car jeep = new Jeep();
        jeep.installEngine2000();
        jeep.installEngine2200();

        //接口方法不断增加，且可能会出现大量无用的空方法
    }
}