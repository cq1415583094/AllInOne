package com.hz.ex;

public class Client {
    public static void main(String[] args) {
        double num = 200;

//        Context context = new Context(new StrategyA());
        Context context = new Context(new StrategyB());
        double realNum = context.cost(num);

        System.out.println("实际付款: " + realNum);
    }
}