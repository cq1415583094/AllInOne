package com.hz;

public class Man extends Person {
    public Man(String name, int condition) {
        super(name, condition);
    }

    @Override
    public void getPartner(Person person) {
        if (person instanceof Man) {
            System.out.println("不可以为同性恋");
        } else {
            if (this.getCondition() == person.getCondition()) {
                System.out.println("条件相同," + this.getName() + "和" + person.getName() + "相配");
            } else {
                System.out.println("条件不同," + this.getName() + "和" + person.getName() + "不相配");
            }
        }
    }
}