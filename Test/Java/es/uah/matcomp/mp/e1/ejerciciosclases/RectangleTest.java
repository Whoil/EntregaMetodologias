package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testTodo() {
        Rectangle r = new Rectangle(); // constructor por defecto
        assertEquals(1.0f, r.getLength());
        assertEquals(1.0f, r.getWidth());

        Rectangle r2 = new Rectangle(2, 3); // constructor con parámetros
        assertEquals(2.0f, r2.getLength());
        assertEquals(3.0f, r2.getWidth());

        r.setLength(4);
        r.setWidth(5);
        assertEquals(4.0f, r.getLength());
        assertEquals(5.0f, r.getWidth());

        r.setLength(-1); // caso no válido
        r.setWidth(-1);
        assertEquals(4.0f, r.getLength());
        assertEquals(5.0f, r.getWidth());

        assertEquals(20.0, r.getArea());
        assertEquals(18.0, r.getPerimeter());

        assertEquals("Rectangle [length=4.0 ,width=5.0]", r.toString());
    }
}