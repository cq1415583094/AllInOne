package hz;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        //常用实例化
//        Apple apple = new Apple();
//        Banana banana = new Banana();
//
//        apple.get();
//        banana.get();

        //接口 多态方式实例化
//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//
//        apple.get();
//        banana.get();

        //简单工厂模式实例化
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();

        //简单工厂模式改进版实例化 方式一 调用参数灵活
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        Fruit fruit = FruitFactory.getFruit("xxx");
//        apple.get();
//        banana.get();

        //简单工厂模式改进版实例化 方式二 参数必须是类，参数具有局限性 不过还是推荐该用法
        Fruit apple = FruitFactory.getFruit("hz.Apple");
        Fruit banana = FruitFactory.getFruit("hz.Banana");
        apple.get();
        banana.get();
    }
}