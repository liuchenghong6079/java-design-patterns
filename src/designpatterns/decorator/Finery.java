package designpatterns.decorator;

/**
 * 装饰（Decorator）角色
 *
 * 服饰
 *
 * @author lch
 */
public class Finery extends Person {

    private Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
