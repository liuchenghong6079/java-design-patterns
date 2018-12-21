package designpatterns.flyweight;

/**
 * 抽象享元类：棋子类
 * @author lch
 */
public abstract class Piece {

    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("棋子颜色：" + this.getColor() + ",棋子位置：" + coordinates.getX() + "，"+ coordinates.getY());
    }


}
