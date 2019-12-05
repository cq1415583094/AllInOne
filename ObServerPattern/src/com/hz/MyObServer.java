package com.hz;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

    //观察者回调 当被观察对象改变时执行
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("有人信息被修改了");
    }
}