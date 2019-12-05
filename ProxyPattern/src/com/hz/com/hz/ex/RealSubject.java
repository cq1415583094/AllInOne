package com.hz.com.hz.ex;

/**
 * 真实主题类
 * 相当于出版社卖书
 */
public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
}