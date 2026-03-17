package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void constructorVacio() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth(), 0.0001);
        assertEquals(1.0, r.getLength(), 0.0001);
    }

    @Test
    void constructorConWidthYLength() {
        Rectangle r = new Rectangle(2.0, 3.0);
        assertEquals(2.0, r.getWidth(), 0.0001);
        assertEquals(3.0, r.getLength(), 0.0001);
    }

    @Test
    void constructorCompleto() {
        Rectangle r = new Rectangle(2.0, 3.0, "blue", false);
        assertEquals(2.0, r.getWidth(), 0.0001);
        assertEquals(3.0, r.getLength(), 0.0001);
        assertEquals("blue", r.getColor());
        assertFalse(r.isFilled());
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(4.0, r.getWidth(), 0.0001);
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(7.0);
        assertEquals(7.0, r.getWidth(), 0.0001);
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(5.0, r.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(8.0);
        assertEquals(8.0, r.getLength(), 0.0001);
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(20.0, r.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(18.0, r.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(2.0, 3.0, "red", true);
        assertEquals("Rectangle [Shape [color=red, filler=true], width= 2.0, length= 3.0]", r.toString());
    }
}