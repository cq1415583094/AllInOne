package com.hz;

/**
 * 工程队
 */
public interface HouseBuilder {

    void makeFloor();

    void makeWall();

    void makeTop();

    House getHouse();
}