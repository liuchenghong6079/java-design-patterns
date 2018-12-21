package designpatterns.iterator;

/**
 * 抽象聚合类
 * @author lch
 */
public interface List {

    public void add(Object o);

    public Object get(int index);

    public Iterator iterator();

    public int size();

}
