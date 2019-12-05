package com.hz;

public class Client {
    public static void main(String[] args) {
        //正常调用各个子系统的功能
        SystemA systemA = new SystemA();
        SystemB systemB = new SystemB();
        SystemC systemC = new SystemC();

        systemA.doSomeThing();
        systemB.doSomeThing();
        systemC.doSomeThing();

        System.out.println("------------");
        //外观模式 不直接与子系统打交道
        Facade facade = new Facade();
        facade.doAB();
        System.out.println(".........");
        facade = new Facade();
        facade.doABC();
    }
}