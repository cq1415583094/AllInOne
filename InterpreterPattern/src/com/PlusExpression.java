package com;

/**
 * 自增解释器
 */
public class PlusExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("自增解释器");
        String input = context.getInput();
        int intInput = Integer.parseInt(input);
        intInput++;
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
}