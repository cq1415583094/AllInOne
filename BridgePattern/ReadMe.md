##桥接(Bridge)模式

####一、什么是桥接模式

桥接模式是构造型设计模式之一，桥接模式是基于类的最小设计原则，通过使用封装、聚合
以及继承等行为来让不同的类承担不同的责任。主要特点就是把抽象和行为实现分离开来，
从而保持各个部分的独立性以及应对他们的功能扩展。

####二、桥接模式的结构

####三、桥接模式的角色和职责

1、Client：桥接模式的使用者。

2、Abstraction：抽象类或接口，维护对行为实现的引用。

3、Refined Abstraction：Abstraction的子类。

4、Implementor：行为实现类接口。

5、ConcreteImplementor：Implementor子类。