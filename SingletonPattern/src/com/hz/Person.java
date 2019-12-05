package com.hz;

/**
 * 饿汉式
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Person() {

    }

    private static final Person person = new Person();

    public static Person getPerson() {
        return person;
    }
}