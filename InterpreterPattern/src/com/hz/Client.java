package com.hz;

public class Client {
    public static void main(String[] args) {
        String input = "20";
        Context context = new Context(input);
        Expression expression = new PlusExpression();
        expression.interpret(context);

        System.out.println(context.getOutput());

        Expression expression1 = new MinusExpression();
        expression1.interpret(context);
        System.out.println(context.getOutput());
    }
}