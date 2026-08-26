package co.edu.unicauca.polymorphismlab.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldCalculateArea() {

        Square square = new Square(2.3);

        double expectedArea = 5.29;

        assertEquals(
                expectedArea,
                square.calculateArea(),
                0.001
        );
    }

    @Test
    public void shouldCalculatePerimeter() {

        Square square = new Square(2.3);

        double expectedPerimeter = 9.2;

        assertEquals(
                expectedPerimeter,
                square.calculatePerimeter(),
                0.001
        );
    }
}