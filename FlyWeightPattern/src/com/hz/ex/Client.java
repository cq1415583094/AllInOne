package com.hz.ex;

public class Client {
    public static void main(String[] args) {
        TeacherFactory teacherFactory = new TeacherFactory();
        Teacher t1 = teacherFactory.getTeacher("001");
        Teacher t2 = teacherFactory.getTeacher("002");
        Teacher t3 = teacherFactory.getTeacher("001");
        Teacher t4 = teacherFactory.getTeacher("004");

        System.out.println(t1.getNumber());
        System.out.println(t2.getNumber());
        System.out.println(t3.getNumber());
        System.out.println(t4.getNumber());

        if (t1 == t3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}