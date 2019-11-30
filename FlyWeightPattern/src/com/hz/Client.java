package com.hz;

public class Client {

    public static void main(String[] args) {
        //平时使用
        MyCharacter m1 = new MyCharacter('a');
        MyCharacter m2 = new MyCharacter('b');
        MyCharacter m3 = new MyCharacter('a');
        MyCharacter m4 = new MyCharacter('d');

        m1.display();
        m2.display();
        m3.display();
        m4.display();

        //m1 m3虽然数据一样但确实不同的对象
        if (m1 == m3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("---------------------------------------");

        //享元模式
        MyCharacterFactory myCharacterFactory = new MyCharacterFactory();
        MyCharacter m11 = myCharacterFactory.getMyCharacter('a');
        MyCharacter m12 = myCharacterFactory.getMyCharacter('b');
        MyCharacter m13 = myCharacterFactory.getMyCharacter('a');
        MyCharacter m14 = myCharacterFactory.getMyCharacter('d');

        m11.display();
        m12.display();
        m13.display();
        m14.display();

        if (m11 == m13) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}