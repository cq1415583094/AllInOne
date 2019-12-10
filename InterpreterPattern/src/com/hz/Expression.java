package com.hz;

/**
 * 解释器抽象类
 */
public abstract class Expression {
    //处理
    public abstract void interpret(Context context);
}