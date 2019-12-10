package com.hz;

/**
 * 解释器上下文环境，为一种文法
 */
public class Context {
    public String input;
    public int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}