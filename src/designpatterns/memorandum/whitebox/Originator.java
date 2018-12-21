package designpatterns.memorandum.whitebox;

/**
 * 发起人角色
 * @author lch
 */
public class Originator {

    private String state;

    /**
     * 创建备忘录对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 将状态恢复到之前储存的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
