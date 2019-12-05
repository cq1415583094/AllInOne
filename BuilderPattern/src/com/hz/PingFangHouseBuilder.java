package com.hz;

/**
 * 平房工程队
 */
public class PingFangHouseBuilder implements HouseBuilder {
    House house = new House();

    @Override
    public void makeFloor() {
//        house.setFloor("平房-->地板");
        Floor floor = new Floor();
        floor.setName("平房-->大象地板");
        house.setNewFloor(floor);
    }

    @Override
    public void makeWall() {
        house.setWall("平房-->墙面");
    }

    @Override
    public void makeTop() {
        house.setTop("平房-->吊顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}