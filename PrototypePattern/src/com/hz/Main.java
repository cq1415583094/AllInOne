package com.hz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(18);
        person1.setSex("男");

        List<String> friends = new ArrayList<>();
        friends.add("王五");
        friends.add("赵六");
        person1.setFriends(friends);

//        Person person2 = new Person();
//        person2.setName("李四");
//        person2.setAge(18);
//        person2.setSex("男");

        Person person2 = person1.clone(); //对象不同，数据相同，浅克隆 若对象中存在一个对象则该存在的对象为同一对象

        person2.setName("李四");

        System.out.println(person1.getName() + " : " + person2.getName());

        System.out.println(person1.getFriends() + " : " + person2.getFriends());

        friends.add("七七");
        person1.setFriends(friends);

        System.out.println(person1.getFriends() == person2.getFriends()); //true
        System.out.println(person1.getFriends().get(0) == person2.getFriends().get(0)); //true

        System.out.println(person1.getFriends());
        System.out.println(person2.getFriends());

    }
}