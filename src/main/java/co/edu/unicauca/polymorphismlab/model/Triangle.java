package co.edu.unicauca.polymorphismlab.model;

public class Triangle extends Figure {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return (getX1() * getY1()) / 2;
    }

    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(
                (getX1() * getX1()) +
                (getY1() * getY1())
        );

        return getX1() + getY1() + hypotenuse;
    }
}