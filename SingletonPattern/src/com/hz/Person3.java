package com.hz;

/**
 * 双重检查
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

    //同步方法
    public synchronized static Person3 getPerson3() {
        if (person == null) {
            person = new Person3();
        }
        return person;
    }

    //同步代码块-双重检查
    public static Person3 getPersonNew3() {
        if (person == null) {
            synchronized (Person3.class) {
                if (person == null) {
                    person = new Person3();
                }
            }
        }
        return person;
    }
}