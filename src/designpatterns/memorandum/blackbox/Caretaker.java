package designpatterns.memorandum.blackbox;


/**
 * 负责人角色
 * @author lch
 */
public class Caretaker {

    private MementoIF memento;

    /**
     * 获取备忘录对象
     * @return
     */
    public MementoIF retrieveMemento(){
        return memento;
    }

    /**
     * 保存备忘录对象
     * @param memento
     */
    public void saveMemneto(MementoIF memento){
        this.memento = memento;
    }

}
