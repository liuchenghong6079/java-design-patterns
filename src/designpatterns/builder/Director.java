package designpatterns.builder;

/**
 *  指导者（Director）
 *
 * @author lch
 */
public class Director {

    public static Humanity construct(HumanityBuildde humanityBuildde){
        humanityBuildde.buildClothes();
        humanityBuildde.buildPants();
        humanityBuildde.buildShoes();
        return humanityBuildde.builder();
    }

}
