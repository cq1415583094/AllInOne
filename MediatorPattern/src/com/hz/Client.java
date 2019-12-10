package com.hz;

public class Client {
    public static void main(String[] args) {
        //正常用法
        Man zhangsan = new Man("张三", 6);
        Man lisi = new Man("李四", 7);
        Woman xiaofang = new Woman("小芳", 6);

        zhangsan.getPartner(xiaofang);
        lisi.getPartner(xiaofang);
        zhangsan.getPartner(lisi);

        //此时 Man和Woman类中存在大量的重复代码，当需求修改时 两个类都需要做修改 两个类也存在大量耦合
    }
}