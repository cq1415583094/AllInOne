package com.hz.ex;

public class Client {
    public static void main(String[] args) {
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        //设置每个节点的下一个节点
//        head.setNextNode(body);
//        body.setNextNode(tail);
        //只需要执行第一个节点，根据上面设置的步骤自动执行
//        head.execHandler();

        System.out.println("-------------");

        head.setNextNode(tail).setNextNode(body);
        head.execHandler();
    }
}