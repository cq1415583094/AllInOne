package com.hz;

public class Client {
    public static void main(String[] args) {
        //正常使用
//        Strategy strategy = new MD5Strategy();
//        strategy.encrypt();

        Context context = new Context(new MD5Strategy());
        context.encrypy();
    }
}