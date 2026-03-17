package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p = new Point2D(2, 3);
        assertEquals(2, p.getX());
    }

    @Test
    void setX() {
        Point2D p = new Point2D();
        p.setX(5);
        assertEquals(5, p.getX());
    }

    @Test
    void getY() {
        Point2D p = new Point2D(2, 3);
        assertEquals(3, p.getY());

    }

    @Test
    void setY() {
        Point2D p = new Point2D();
        p.setY(6);
        assertEquals(6, p.getY());

    }

    @Test
    void getXY() {
        Point2D p = new Point2D(2, 3);
        assertArrayEquals(new float[]{2, 3}, p.getXY());
    }

    @Test
    void setXY() {
        Point2D p = new Point2D();
        p.setXY(4, 5);
        assertArrayEquals(new float[]{4, 5}, p.getXY());
    }

    @Test
    void testToString() {
        Point2D p = new Point2D(2, 3);
        assertEquals("(2.0,3.0)", p.toString());
    }
}