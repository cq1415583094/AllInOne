package com.hz.com.hz.ex;

import java.lang.reflect.Proxy;

/**
 * 动态代理处理
 */
public class Client {
    public static void main(String[] args) {
//        RealSubject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler();

        Subject proxy = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), myHandler);
        proxy.sailBook();
    }
}