package designpatterns.builder;

/**
 * 建造者角色（Builder）
 *
 * 创造人类接口
 *
 * @author lch
 */
public interface HumanityBuildde {

    public void buildClothes();

    public void buildPants();

    public void buildShoes();

    public Humanity builder();

}
