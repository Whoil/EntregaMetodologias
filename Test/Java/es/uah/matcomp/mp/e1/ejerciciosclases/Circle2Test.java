package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {
    @Test
    void testTodo() {
        Circle2 c = new Circle2(); // constructor por defecto
        assertEquals(1.0, c.getRadius());

        Circle2 c2 = new Circle2(5); // constructor con parámetro
        assertEquals(5.0, c2.getRadius());

        c.setRadius(3);
        assertEquals(3.0, c.getRadius());

        c.setRadius(-2); // rama del if
        assertEquals(3.0, c.getRadius());

        assertEquals(9 * Math.PI, c.getArea());
        assertEquals(6 * Math.PI, c.getCircumference());

        assertEquals("Circle [radius=3.0]", c.toString());
    }
}