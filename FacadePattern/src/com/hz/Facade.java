package com.hz;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    /**
     * 做子系统AB的功能
     */
    public void doAB() {
        systemA.doSomeThing();
        systemB.doSomeThing();
    }

    /**
     * 做子系统ABC的功能
     */
    public void doABC() {
        systemA.doSomeThing();
        systemB.doSomeThing();
        systemC.doSomeThing();
    }
}