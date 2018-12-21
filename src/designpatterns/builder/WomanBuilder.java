package designpatterns.builder;
/**
 * 女人
 *
 * 具体创建者角色（ConcreteBuilder）
 *
 * @author lch
 */
public class WomanBuilder implements HumanityBuildde {

    private Humanity woman;

    public WomanBuilder() {
        woman = new Humanity();
    }

    @Override
    public void buildClothes() {
        woman.setClothes("裙子");
    }

    @Override
    public void buildPants() {

    }

    @Override
    public void buildShoes() {
        woman.setShoes("黑色凉鞋");
    }

    @Override
    public Humanity builder() {
        return null;
    }
}
