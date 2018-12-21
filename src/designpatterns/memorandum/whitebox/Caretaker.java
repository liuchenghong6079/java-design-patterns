package designpatterns.memorandum.whitebox;

/**
 * 负责人角色
 * @author lch
 */
public class Caretaker {

    private Memento memento;

    /**
     * 获取备忘录对象
     * @return
     */
    public Memento retrieveMemento(){
        return memento;
    }

    /**
     * 保存备忘录对象
     * @param memento
     */
    public void saveMemneto(Memento memento){
        this.memento = memento;
    }

}
