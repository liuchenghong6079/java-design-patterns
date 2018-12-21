package designpatterns.iterator;

/**
 * 具体聚合类
 * @author lch
 */
public class ConcreteAggregate implements List {

    private Object[] list;

    private int size;

    private int index;

    public ConcreteAggregate() {
        list = new Object[10];
        size = 0;
        index = 0;
    }

    @Override
    public void add(Object o) {
        list[index++] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int size() {
        return size;
    }
}
