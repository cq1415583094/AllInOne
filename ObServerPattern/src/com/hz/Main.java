package com.hz;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.addObserver(new MyObServer()); //将观察者注册到被观察者维护的一个容器中

        person.setName("Jack");
        person.setSex("Man");
        person.setAge(18);
    }
}