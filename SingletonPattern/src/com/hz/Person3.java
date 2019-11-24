package com.hz;

/**
 * 饿汉式
 */
public class Person3 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Person3() {

    }

    private static Person3 person;

    public static Person3 getPerson2() {
        if (person == null) {
            person = new Person3();
        }
        return person;
    }
}