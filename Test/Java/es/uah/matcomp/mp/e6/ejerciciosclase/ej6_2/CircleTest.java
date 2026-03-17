package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle c = new Circle(4);
        assertEquals("Circle[radius=4.0]", c.toString());
    }

    @Test
    void getArea() {
        Circle c = new Circle(4);
        assertEquals(Math.PI * Math.sqrt(4), c.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(4);
        assertEquals(2 * Math.PI * 4, c.getPerimeter());
    }
}