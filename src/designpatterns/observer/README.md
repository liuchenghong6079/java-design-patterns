观察者模式:
         定义了对象之间的一对多依赖，这样一来，当一个对象改变时，它的所有依赖者都会收到通知并自动更新
角色:
   抽象主题角色(Subject):主题角色把所有观察者对象的引用保存在一个聚集里，每个主题都可以有任意数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象
   抽象观察者(Observer):为所有具体观察者定义一个接口，在得到主题通知时更新自己，这个接口叫做更新接口
   具体主题角色(ConcreteSubject):将有关状态存入具体观察者对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知
   具体观察者角色(ConcreteObserver):实现抽象观察者角色所需要的更新接口，一边使本身的状态与制图的状态相协调