package com.hz;

public class Client {
    public static void main(String[] args) {
        //直接使用220V电流
        Current current = new Current();
        current.use220v();

        System.out.println("------ 以下为继承的方式 -----------");

        //此时电脑需要通电，电流要求为18V
        Adapter adapter = new Adapter();
        adapter.use18v();

        System.out.println("------- 以下为委让的方式 ---------");
        Adapter2 adapter2 = new Adapter2(current);
        adapter2.use18v();
    }
}