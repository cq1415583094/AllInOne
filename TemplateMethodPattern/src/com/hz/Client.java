package com.hz;

public class Client {
    public static void main(String[] args) {
        MakeCar bus = new MakeBus();
        bus.makeHead();
        bus.makeBody();
        bus.makeTail();

        System.out.println("--------------");

        MakeCar jeep = new MakeJeep();
        jeep.makeHead();
        jeep.makeBody();
        jeep.makeTail();

        //在上面案例中不管什么车型在组装过程中 步骤是一样的 可是组装过程交给客户端来处理，显然是不合理的
        //作为客户端只要告诉组装车辆即可 过程由模板来完成

        System.out.println("==================");

        bus.make();
        jeep.make();
    }
}