package designpatterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜系
 * @author lch
 */
public class Menu extends MenuComponent {

    private String name;

    private String desc;

    private List<MenuComponent> componentList;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println(this);
        if(componentList == null){
            return;
        }
        System.out.println("-------------------------");
        componentList.stream().forEach(MenuComponent::print);
    }

    @Override
    public void add(MenuComponent component) {
        if(componentList == null){
            componentList = new ArrayList<>();
        }
        componentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        if(componentList == null){
            super.remove(component);
        }

        if(!componentList.contains(component)){
            super.remove(component);
        }

        componentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        if(componentList == null || componentList.size() <= index){
            return null;
        }
        return componentList.get(index);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
