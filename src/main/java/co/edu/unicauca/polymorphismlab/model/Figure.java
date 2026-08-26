package co.edu.unicauca.polymorphismlab.model;

public abstract class Figure {

    private double x1;
    private double y1;

    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    protected double getX1() {
        return x1;
    }

    protected double getY1() {
        return y1;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}