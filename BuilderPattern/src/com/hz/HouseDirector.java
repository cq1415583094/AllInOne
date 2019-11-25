package com.hz;

/**
 * 房子设计师
 */
public class HouseDirector {

    public void makeHouse(HouseBuilder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeTop();
    }
}