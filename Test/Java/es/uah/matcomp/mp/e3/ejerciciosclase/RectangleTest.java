package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testTodo() {
        Rectangle r = new Rectangle(); // constructor por defecto
        assertEquals(1.0, r.getLength());
        assertEquals(1.0, r.getWidth());

        Rectangle r2 = new Rectangle(2, 3); // constructor con parámetros
        assertEquals(2.0, r2.getWidth());
        assertEquals(3.0, r2.getLength());

        Rectangle r3 = new Rectangle(4, 5, "blue", false); // constructor completo
        assertEquals(4.0, r3.getWidth());
        assertEquals(5.0, r3.getLength());
        assertEquals("blue", r3.getColor());
        assertFalse(r3.isFilled());

        r.setLength(6);
        r.setWidth(7);
        assertEquals(6.0, r.getLength());
        assertEquals(7.0, r.getWidth());

        assertEquals(42.0, r.getArea());
        assertEquals(26.0, r.getPerimeter());

        assertEquals("Rectangle[Shape[color=red,filled=true],length=6.0 ,width=7.0]", r.toString());
    }
}