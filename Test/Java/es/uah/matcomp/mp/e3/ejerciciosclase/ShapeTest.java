package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testTodo() {
        Shape s = new Shape();
        assertEquals("red", s.getColor());
        assertTrue(s.isFilled());

        Shape s2 = new Shape("blue", false);
        assertEquals("blue", s2.getColor());
        assertFalse(s2.isFilled());

        s.setColor("green");
        s.setFilled(false);
        assertEquals("green", s.getColor());
        assertFalse(s.isFilled());

        assertEquals("Shape[color=green,filled=false]", s.toString());
    }
}