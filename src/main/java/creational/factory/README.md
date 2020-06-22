>##工厂方法是一种创建型设计模式， 解决了在不指定具体类的情况下创建产品对象的问题。
>##工厂方法定义了一个方法， 且必须使用该方法代替通过直接调用构造函数来创建对象 （ new 操作符） 的方式。 
>##子类可重写该方法来更改将被创建的对象所属类。


##在 Java 中使用模式
###复杂度： 1/3
###流行度： 3/3
###使用示例： 工厂方法模式在 Java 代码中得到了广泛使用。 当你需要在代码中提供高层次的灵活性时， 该模式会非常实用。
###核心 Java 程序库中有该模式的应用：

```
java.util.Calendar#getInstance()
java.util.ResourceBundle#getBundle()
java.text.NumberFormat#getInstance()
java.nio.charset.Charset#forName()
java.net.URLStreamHandlerFactory#createURLStreamHandler(String) （根据协议返回不同的单例对象）
java.util.EnumSet#of()
javax.xml.bind.JAXBContext#createMarshaller() 及其他类似的方法。
```

###识别方法： 工厂方法可通过构建方法来识别， 它会创建具体类的对象， 但以抽象类型或接口的形式返回这些对象。

##生成跨平台的 GUI 元素
###在本例中， 按钮担任产品的角色， 对话框担任创建者的角色。
###不同类型的对话框需要其各自类型的元素。 因此我们可为每个对话框类型创建子类并重写其工厂方法。
###现在， 每种对话框类型都将对合适的按钮类进行初始化。 对话框基类使用其通用接口与对象进行交互， 因此代码更改后仍能正常工作。