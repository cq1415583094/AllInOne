package com.hz;

public class Main {

    public static void main(String[] args) {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();
        System.out.println(p1 == p2);

        Person2 p3 = Person2.getPerson2();
        Person2 p4 = Person2.getPerson2();
        System.out.println(p3 == p4);

    }
}