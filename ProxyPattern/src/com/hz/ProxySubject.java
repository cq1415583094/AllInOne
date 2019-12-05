package com.hz;

/**
 * 代理类
 * 相当于各个卖书平台或书店
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public ProxySubject() {
        realSubject = new RealSubject();
    }

    @Override
    public void sailBook() {
        this.discount();
        this.realSubject.sailBook();
        this.give();
    }

    //折扣
    public void discount() {
        System.out.println("打9折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }
}