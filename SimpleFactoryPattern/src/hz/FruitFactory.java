package hz;

/**
 * 水果工厂
 */
public class FruitFactory {
    /**
     * 获得苹果实例
     */
    public static Fruit getApple() {
        return new Apple();
    }

    /**
     * 获取香蕉实例
     * @return
     */
    public static Banana getBanana() {
        return new Banana();
    }

    /**
     * 获取水果
     * @param type
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //方式一
//        if (type.equalsIgnoreCase("apple")) {
//            return Apple.class.newInstance();
//        } else if (type.equalsIgnoreCase("banana")) {
//            return Banana.class.newInstance();
//        }
//        System.out.println("未找到对应的实例化类");
//        return null;

        //方式二
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}