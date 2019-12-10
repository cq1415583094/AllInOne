package com.hz.ex;

public abstract class Person {
    private String name; //姓名
    private int condition; //条件
    private Mediator mediator; //中介

    public Person(String name, int condition, Mediator mediator) {
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
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

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getPartner(Person person);
}