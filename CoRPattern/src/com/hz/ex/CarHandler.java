package com.hz.ex;

//责任链模式
public abstract class CarHandler {

    //持有自身的一个引用 具体实现需要一个引用，设置为受保护类型
    protected CarHandler carHandler;

    //设置责任链中的下一个节点
    public CarHandler setNextNode(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void execHandler();
}