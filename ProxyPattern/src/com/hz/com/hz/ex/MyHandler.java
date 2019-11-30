package com.hz.com.hz.ex;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理处理类
 */
public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public MyHandler() {
        realSubject = new RealSubject();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        this.discount();

        result = method.invoke(realSubject, args);

        this.give();

        return result;
    }

    public void discount() {
        System.out.println("打8.5折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }
}