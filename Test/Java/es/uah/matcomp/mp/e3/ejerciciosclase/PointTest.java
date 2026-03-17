package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p = new Point(2, 3);
        assertEquals(2, p.getX());

    }

    @Test
    void setX() {
        Point p = new Point();
        p.setX(5);
        assertEquals(5, p.getX());

    }

    @Test
    void getY() {
        Point p = new Point(2, 3);
        assertEquals(3, p.getY());
    }

    @Test
    void setY() {
        Point p = new Point();
        p.setY(6);
        assertEquals(6, p.getY());
    }

    @Test
    void getXY() {
        Point p = new Point(2, 3);
        assertArrayEquals(new float[]{2, 3}, p.getXY());
    }

    @Test
    void setXY() {
        Point p = new Point();
        p.setXY(4, 5);
        assertArrayEquals(new float[]{4, 5}, p.getXY());

    }

    @Test
    void testToString() {
            Point p = new Point(2, 3);
            assertEquals("(2.0,3.0)", p.toString());
    }
}