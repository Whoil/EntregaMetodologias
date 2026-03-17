package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void constructorVacio() {
        Square s = new Square();
        assertEquals(1.0, s.getWidth(), 0.0001);
        assertEquals(1.0, s.getLength(), 0.0001);
    }

    @Test
    void constructorConSide() {
        Square s = new Square(4.0);
        assertEquals(4.0, s.getSide(), 0.0001);
        assertEquals(4.0, s.getWidth(), 0.0001);
        assertEquals(4.0, s.getLength(), 0.0001);
    }

    @Test
    void constructorCompleto() {
        Square s = new Square(5.0, "blue", false);
        assertEquals(5.0, s.getSide(), 0.0001);
        assertEquals("blue", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void getSide() {
        Square s = new Square(6.0);
        assertEquals(6.0, s.getSide(), 0.0001);
    }

    @Test
    void setSide() {
        Square s = new Square();
        s.setSide(7.0);
        assertEquals(7.0, s.getSide(), 0.0001);
        assertEquals(7.0, s.getWidth(), 0.0001);
        assertEquals(7.0, s.getLength(), 0.0001);
    }

    @Test
    void setWidth() {
        Square s = new Square(3.0);
        s.setWidth(8.0);
        assertEquals(8.0, s.getSide(), 0.0001);
        assertEquals(8.0, s.getWidth(), 0.0001);
        assertEquals(8.0, s.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Square s = new Square(3.0);
        s.setLength(9.0);
        assertEquals(9.0, s.getSide(), 0.0001);
        assertEquals(9.0, s.getWidth(), 0.0001);
        assertEquals(9.0, s.getLength(), 0.0001);
    }

    @Test
    void testToString() {
        Square s = new Square(2.0, "green", true);
        assertEquals("SquareRectangle [Shape [color=green, filler=true], width= 2.0, length= 2.0]", s.toString());
    }
}