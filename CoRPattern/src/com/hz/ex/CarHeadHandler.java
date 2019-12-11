package com.hz.ex;

public class CarHeadHandler extends CarHandler {
    @Override
    public void execHandler() {
        System.out.println("组装车头");
        if (this.carHandler != null) {
            this.carHandler.execHandler();
        }
    }
}