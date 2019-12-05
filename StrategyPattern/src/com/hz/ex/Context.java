package com.hz.ex;

/**
 * 策略容器
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double cost(double num) {
        return this.strategy.cost(num);
    }
}