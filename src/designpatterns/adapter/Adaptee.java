package designpatterns.adapter;

/**
 *  需要适配的类
 *  @author lch
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("被适配类...我是两孔插座  具有特殊功能");
    }

}
