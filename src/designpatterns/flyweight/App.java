package designpatterns.flyweight;

public class App {

    public static void main(String[] args) {
        PieceFactory pieceFactory = PieceFactory.getInstance();

        Piece white1 = pieceFactory.getPiece("w");
        Piece white2 = pieceFactory.getPiece("w");

        Piece black1 = pieceFactory.getPiece("b");
        Piece black2 = pieceFactory.getPiece("b");
        System.out.println(white1 == white2);
        System.out.println(black1 == black2);

        white1.display(new Coordinates(2,3));
        black1.display(new Coordinates(4,5));
    }

}
