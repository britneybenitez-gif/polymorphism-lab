package co.edu.unicauca.polymorphismlab.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    @Test
    public void shouldCalculateArea() {

        Circle circle = new Circle(1.0);

        double expectedArea = Math.PI;

        assertEquals(
                expectedArea,
                circle.calculateArea(),
                0.001
        );
    }

    @Test
    public void shouldCalculatePerimeter() {

        Circle circle = new Circle(1.0);

        double expectedPerimeter = 2 * Math.PI;

        assertEquals(
                expectedPerimeter,
                circle.calculatePerimeter(),
                0.001
        );
    }
}