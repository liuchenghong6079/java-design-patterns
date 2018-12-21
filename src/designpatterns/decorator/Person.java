package designpatterns.decorator;

/**
 * 具体构件（Concrete Component）角色
 *
 * 人类
 *
 * @author lch
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(String.format("装扮的是%s",name));
    }
}
