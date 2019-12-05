package com.hz;

/**
 * 饿汉式
 */
public class Person2 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Person2() {

    }

    private static Person2 person;

    public static Person2 getPerson2() {
        if (person == null) {
            person = new Person2();
        }
        return person;
    }
}