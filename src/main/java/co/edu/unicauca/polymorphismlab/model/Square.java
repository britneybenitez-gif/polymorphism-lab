package co.edu.unicauca.polymorphismlab.model;

public class Square extends Figure {

    public Square(double side) {
        super(side, 0);
    }

    @Override
    public double calculateArea() {
        return getX1() * getX1();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getX1();
    }
}