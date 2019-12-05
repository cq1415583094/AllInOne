##原型模式

####一、什么是原型模式

原型模式是一种对象创建模式，采用复制原型对象的方法来创建对象的实例。使用原型模式
创建的实例，具有与原型一样的数据。

####二、原型模式特点

1、由原型对象自身创建目标对象。

2、目标对象是原型对象的一个克隆

3、根据对象克隆深度层次可分为浅克隆和深克隆。

####三、原型模式应用场景

1、当创建的对象，不止继承其基类的基本结构，还继承原型对象的数据。

2、当希望对目标对象的修改不影响既有对象的原型对象。

3、隐藏克隆操作的细节。