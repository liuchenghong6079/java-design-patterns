package designpatterns.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类：棋子工厂
 * @author lch
 */
public class PieceFactory {

    private static PieceFactory factory = new PieceFactory();

    private static HashMap<String,Object> map;

    private PieceFactory() {
        map = new HashMap<>();
        Piece blackPiece = new BlackPiece();
        Piece whitePiece = new WhitePiece();
        map.put("w",whitePiece);
        map.put("b",blackPiece);
    }

    public static PieceFactory getInstance(){
        return factory;
    }

    public Piece getPiece(String color){
        return (Piece) map.get(color);
    }
}
