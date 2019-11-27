package com.hz.ex;

/**
 * 商家八折活动策略
 */
public class StrategyA implements Strategy {
    @Override
    public double cost(double num) {
        return num * 0.8;
    }
}