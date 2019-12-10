package com.hz.ex;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Man zhangsan = new Man("张三", 7, mediator);
        Man lisi = new Man("李四", 6, mediator);
        Woman xiaofang = new Woman("小芳", 7, mediator);

//        zhangsan.getPartner(xiaofang);
//        lisi.getPartner(xiaofang);

        zhangsan.getPartner(lisi);
    }
}