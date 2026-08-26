package co.edu.unicauca.polymorphismlab.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void shouldCalculateArea() {

        Triangle triangle = new Triangle(4.2, 4.5);

        double expectedArea = 9.45;

        assertEquals(
                expectedArea,
                triangle.calculateArea(),
                0.001
        );
    }

    @Test
    public void shouldCalculatePerimeter() {

        Triangle triangle = new Triangle(4.2, 4.5);

        double hypotenuse = Math.sqrt(
                (4.2 * 4.2) +
                (4.5 * 4.5)
        );

        double expectedPerimeter =
                4.2 + 4.5 + hypotenuse;

        assertEquals(
                expectedPerimeter,
                triangle.calculatePerimeter(),
                0.001
        );
    }
}