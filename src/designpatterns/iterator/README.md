迭代器模式:
    提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示
    
角色:
    Iterator（抽象迭代器）：定义访问和遍历元素的接口，声明获取元素的方法。
    ConcreteIterator（具体迭代器）：实现抽象迭代器接口，完成遍历并跟踪元素当前位置。
    Aggregate（抽象聚合类）：存储对象，创建迭代器对象的接口，声明创建迭代器对象的方法。
    ConcreteAggregate（具体聚合类）：实现创建迭代器对象的接口，实现其方法。
    