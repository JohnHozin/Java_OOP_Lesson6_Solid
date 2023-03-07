package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareView squareView = new SquareView();
        squareView.draw(square.getSide() * 3);
    }
}
