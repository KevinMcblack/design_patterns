>##生成器是一种创建型设计模式， 使你能够分步骤创建复杂对象。
>##与其他创建型模式不同， 生成器不要求产品拥有通用接口。 这使得用相同的创建过程生成不同的产品成为可能。

在 Java 中使用模式
复杂度： 
流行度： 

使用示例： 生成器模式是 Java 世界中的一个著名模式。 当你需要创建一个可能有许多配置选项的对象时， 该模式会特别有用。
生成器在 Java 核心程序库中得到了广泛的应用：
```
java.lang.StringBuilder#append() （ 非同步 ）
java.lang.StringBuffer#append() （ 同步 ）
java.nio.ByteBuffer#put() （还有 Char­Buffer、 Short­Buffer、 Int­Buffer、 Long­Buffer、 Float­Buffer 和 Double­Buffer）
javax.swing.GroupLayout.Group#addComponent()
java.lang.Appendable的所有实现
```

识别方法： 生成器模式可以通过类来识别， 它拥有一个构建方法和多个配置结果对象的方法。 生成器方法通常支持方法链 （例如 someBuilder->setValueA(1)->setValueB(2)->create() ）。

分步制造汽车
在本例中， 生成器模式允许你分步骤地制造不同型号的汽车。
示例还展示了生成器如何使用相同的生产过程制造不同类型的产品 （汽车手册）。
主管控制着构造顺序。 它知道制造各种汽车型号需要调用的生产步骤。 它仅与汽车的通用接口进行交互。 这样就能将不同类型的生成器传递给主管了。
最终结果将从生成器对象中获得， 因为主管不知道最终产品的类型。 只有生成器对象知道自己生成的产品是什么。