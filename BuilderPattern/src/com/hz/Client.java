package com.hz;

public class Client {
    public static void main(String[] args) {
        //正常情况 房子的创建和内部的安装都由客户端自己完成，修改扩展较麻烦
//        House house = new House();
//        house.setFloor("地板");
//        house.setWall("墙面");
//        house.setTop("吊顶");

        //客户指导工程队来完成，当然房子里的细节还是需要客户指导，只是不用客户自己动手
//        HouseBuilder builder = new PingFangHouseBuilder();
//        builder.makeFloor();
//        builder.makeWall();
//        builder.makeTop();
//        House house = builder.getHouse();

        //客户叫来一个工程队和设计师，让设计师去安排工程队去做
        HouseBuilder builder = new PingFangHouseBuilder(); //平房工程队
//        HouseBuilder builder = new GongYuBuilder(); //公寓工程队
        HouseDirector director = new HouseDirector();      //设计师
        director.makeHouse(builder);    //让工程队去听设计师安排

        House house = builder.getHouse();

        //此时，若需要去维修公寓，只需要新建一个公寓Builder并创建Builder对象传给设计师

//        System.out.println(house.getFloor());
        System.out.println(house.getNewFloor().getName());
        System.out.println(house.getWall());
        System.out.println(house.getTop());

    }
}