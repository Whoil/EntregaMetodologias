package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle r = new Rectangle(2, 3);
        assertNotNull(r.toString());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(6, r.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(10, r.getPerimeter());
    }
}