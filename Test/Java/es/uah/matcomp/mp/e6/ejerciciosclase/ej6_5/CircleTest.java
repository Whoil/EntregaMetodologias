package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle c = new Circle(5);
        assertNotNull(c.toString());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(5);
        assertEquals(2 * Math.PI * 5, c.getPerimeter());
    }

    @Test
    void getArea() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 5 * 5, c.getArea());
    }
}