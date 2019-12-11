package com.hz;

public class Client {
    public static void main(String[] args) {
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        //平常用法，需要手动去维护执行步骤，当步骤调整时，代码难以维护。
        head.execHandler();
        body.execHandler();
        tail.execHandler();
    }
}