package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testTodo() {
        Square s = new Square(); // constructor por defecto
        assertEquals(1.0, s.getSide());

        Square s2 = new Square(2); // constructor con lado
        assertEquals(2.0, s2.getSide());

        Square s3 = new Square(3, "blue", true); // constructor completo
        assertEquals(3.0, s3.getSide());
        assertEquals("blue", s3.getColor());
        assertTrue(s3.isFilled());

        s.setSide(4);
        assertEquals(4.0, s.getSide());
        assertEquals(4.0, s.getWidth());
        assertEquals(4.0, s.getLength());

        s.setWidth(5);
        assertEquals(5.0, s.getSide());

        s.setLength(6);
        assertEquals(6.0, s.getSide());

        assertEquals("Square[Rectangle[Shape[color=red,filled=true],length=6.0 ,width=6.0]]", s.toString());
    }
}