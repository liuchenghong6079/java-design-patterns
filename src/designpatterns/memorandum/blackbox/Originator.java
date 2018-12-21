package designpatterns.memorandum.blackbox;


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
    public MementoIF createMemento(){
        return new Memento(state);
    }

    /**
     * 将状态恢复到之前储存的状态
     * @param memento
     */
    public void restoreMemento(MementoIF memento){
        this.state = ((Memento)memento).getState();
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

    private class Memento implements MementoIF {

        private String state;

        public Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }

}
