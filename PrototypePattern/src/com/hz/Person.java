package com.hz;

import java.util.ArrayList;
import java.util.List;

/**
 * 只有实现Cloneable该接口，才可克隆
 * 该接口只是一个申明，如同可序列化接口
 */
public class Person implements Cloneable {
    public String name;
    public int age;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String sex;

    public List<String> friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //浅克隆
//    @Override
//    public Person clone() {
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    //深度克隆
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            List<String> friends = new ArrayList<>();
            for (String friend : this.getFriends()) {
                friends.add(friend);
            }
            person.setFriends(friends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}