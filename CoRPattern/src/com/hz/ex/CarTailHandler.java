package com.hz.ex;

public class CarTailHandler extends CarHandler {
    @Override
    public void execHandler() {
        System.out.println("组装车尾");
        if (this.carHandler != null) {
            this.carHandler.execHandler();
        }
    }
}