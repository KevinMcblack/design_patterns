>##单例是一种创建型设计模式， 让你能够保证一个类只有一个实例， 并提供一个访问该实例的全局节点。
>##单例拥有与全局变量相同的优缺点。 尽管它们非常有用， 但却会破坏代码的模块化特性。
>##在某些其他上下文中， 你不能使用依赖于单例的类。 你也将必须使用单例类。 绝大多数情况下， 该限制会在创建单元测试时出现。
>###复杂度： 1/3
>###流行度： 2/3


![Image text](https://github.com/your_github/address/blob/master/image/1.png)

####使用示例： 许多开发者将单例模式视为一种反模式。 因此它在 Java 代码中的使用频率正在逐步减少。

####尽管如此， Java 核心程序库中仍有相当多的单例示例：
```
    java.lang.Runtime#getRuntime()
    java.awt.Desktop#getDesktop()
    java.lang.System#getSecurityManager()
```
####识别方法： 单例可以通过返回相同缓存对象的静态构建方法来识别。

