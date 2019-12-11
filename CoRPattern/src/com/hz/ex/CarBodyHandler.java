package com.hz.ex;

public class CarBodyHandler extends CarHandler {
    @Override
    public void execHandler() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.execHandler();
        }
    }
}