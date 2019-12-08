package com.hz;

public class Adapter2 {
    private Current current;

    public Adapter2(Current current) {
        this.current = current;
    }

    public void use18v() {
        System.out.println("使用委让方式的适配器");
        this.current.use220v();
    }
}