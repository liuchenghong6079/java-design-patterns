package designpatterns.builder;

/**
 * 男人
 *
 * 具体创建者角色（ConcreteBuilder）
 *
 * @author lch
 */
public class ManBuilder implements HumanityBuildde {

    private Humanity man;

    public ManBuilder() {
        man = new Humanity();
    }

    @Override
    public void buildClothes() {
        man.setClothes("黄色衣服");
    }

    @Override
    public void buildPants() {
        man.setPants("黑色裤子");
    }

    @Override
    public void buildShoes() {
        man.setShoes("蓝色鞋子");
    }

    @Override
    public Humanity builder() {
        return man;
    }

}
