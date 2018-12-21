package designpatterns.iterator;

/**
 * 具体迭代器
 * @author lch
 */
public class ConcreteIterator implements Iterator {

    private List list;

    private int index;

    public ConcreteIterator(List list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index >= list.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object o = list.get(index);
        index++;
        return o;
    }
}
