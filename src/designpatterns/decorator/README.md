装饰者模式:
       在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象

角色:       
    抽象构件（Component）角色：给出一个抽象接口，以规范准备接收附加职责的对象。
    具体构件（Concrete Component）角色：定义一个将要接收附加职责的类。
    装饰（Decorator）角色：持有一个构件（Component）对象的实例，并实现一个与抽象构件接口一致的接口，从外类来扩展Component类的功能，但对于Component类来说，是无需知道Decorato的存在的。
    具体装饰（Concrete Decorator）角色：负责给构件对象添加上附加的职责。

模式简化:
       如果只有一个Concrete Component类而没有抽象的Component接口时，可以让Decorator继承Concrete Component。
       如果只有一个Concrete Decorator类时，可以将Decorator和Concrete Decorator合并。       
         