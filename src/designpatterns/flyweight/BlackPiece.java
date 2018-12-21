package designpatterns.flyweight;

/**
 * 具体享元类：黑色棋子
 * @author lch
 */
public class BlackPiece extends Piece {
    @Override
    public String getColor() {
        return "黑色";
    }
}
