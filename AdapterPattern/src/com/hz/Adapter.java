package com.hz;

/**
 * 适配器 将220v电流转为18v去使用
 */
public class Adapter extends Current {
    public void use18v() {
        System.out.println("使用继承方式的适配器");
        this.use220v();
    }
}