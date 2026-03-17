package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testTodo() {
        Circle c = new Circle(); // constructor por defecto
        assertEquals(1.0, c.getRadius());

        Circle c2 = new Circle(2); // constructor con radio
        assertEquals(2.0, c2.getRadius());

        Circle c3 = new Circle(3, "blue", true); // constructor completo
        assertEquals(3.0, c3.getRadius());
        assertEquals("blue", c3.getColor());
        assertTrue(c3.isFilled());

        c.setRadius(4);
        assertEquals(4.0, c.getRadius());

        assertEquals(Math.PI * Math.sqrt(4), c.getArea()); // según el código
        assertEquals(2 * Math.PI * 4, c.getPerimeter());

        assertEquals("Circle[Shape[color=red,filled=true],radius=4.0]", c.toString());
    }
}