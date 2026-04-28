package figures;

public class Square implements figuresq {
    private int side;

    public Square(int s) {
        side = s;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }
}