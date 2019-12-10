package com.hz;

public abstract class Person {
    private String name; //姓名
    private int condition; //条件

    public Person(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    /**
     * 获取伴侣
     * @param person
     */
    public abstract void getPartner(Person person);
}