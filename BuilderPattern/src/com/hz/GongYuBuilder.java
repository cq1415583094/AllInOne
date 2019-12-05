package com.hz;

public class GongYuBuilder implements HouseBuilder {
    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓-->墙面");
    }

    @Override
    public void makeTop() {
        house.setTop("公寓-->吊顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}