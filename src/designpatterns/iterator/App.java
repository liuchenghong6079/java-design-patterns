package designpatterns.iterator;

public class App {

    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
