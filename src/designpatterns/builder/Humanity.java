package designpatterns.builder;

/**
 * 产品（Product）
 *
 * 人类
 *
 * @author lch
 */
public class Humanity {

    /** 衣服  */
    private String clothes;
    /** 裤子  */
    private String pants;
    /** 鞋子  */
    private String shoes;

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Humanity{" +
                "clothes='" + clothes + '\'' +
                ", pants='" + pants + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }
}
