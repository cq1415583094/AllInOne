package com.hz.ex;

/**
 * 中介者
 */
public class Mediator {
    private Man man;
    private Woman woman;

    public void setMan(Man man) {
        this.man = man;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void getPartner(Person person) {
        if (person instanceof Man) {
            this.setMan((Man) person);
        } else if (person instanceof Woman) {
            this.setWoman((Woman) person);
        }

        if (this.man == null || this.woman == null) {
            System.out.println("不可以为同性恋");
        } else {
            if (this.man.getCondition() == this.woman.getCondition()) {
                System.out.println(this.man.getName() + "和" + this.woman.getName() + "相配");
            } else {
                System.out.println(this.man.getName() + "和" + this.woman.getName() + "不相配");
            }
        }

    }
}