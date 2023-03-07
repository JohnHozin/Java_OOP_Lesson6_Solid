package solid.srp;

public class Square {

    private int side;

    public int getArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }
}
