package designpatterns.flyweight;

/**
 * 具体享元类：白色棋子类
 * @author lch
 */
public class WhitePiece extends Piece {
    @Override
    public String getColor() {
        return "白色";
    }
}
