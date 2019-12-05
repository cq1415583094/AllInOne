package com.hz;

public class House {

    private String floor;   //地板
    private String wall;    //墙面
    private String top;     //吊顶

    private Floor newFloor; //新的地板对象

    public Floor getNewFloor() {
        return newFloor;
    }

    public void setNewFloor(Floor newFloor) {
        this.newFloor = newFloor;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}