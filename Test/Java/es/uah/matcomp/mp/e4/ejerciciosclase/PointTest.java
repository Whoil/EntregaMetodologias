package es.uah.matcomp.mp.e4.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void constructorVacio() {
        Point p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    void constructorConParametros() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    void getX() {
        Point p = new Point(5, 2);
        assertEquals(5, p.getX());
    }

    @Test
    void setX() {
        Point p = new Point();
        p.setX(7);
        assertEquals(7, p.getX());
    }

    @Test
    void getY() {
        Point p = new Point(5, 9);
        assertEquals(9, p.getY());
    }

    @Test
    void setY() {
        Point p = new Point();
        p.setY(8);
        assertEquals(8, p.getY());
    }

    @Test
    void getXY() {
        Point p = new Point(2, 6);
        int[] xy = p.getXY();
        assertArrayEquals(new int[]{2, 6}, xy);
    }

    @Test
    void setXY() {
        Point p = new Point();
        p.setXY(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }

    @Test
    void testToString() {
        Point p = new Point(3, 4);
        assertEquals("(3,4)", p.toString());
    }

    @Test
    void distanceConCoordenadas() {
        Point p = new Point(3, 4);
        assertEquals(5.0, p.distance(0, 0), 0.0001);
    }

    @Test
    void distanceConOtroPunto() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 0);
        assertEquals(5.0, p1.distance(p2), 0.0001);
    }

    @Test
    void distanceAlOrigen() {
        Point p = new Point(3, 4);
        assertEquals(5.0, p.distance(), 0.0001);
    }
}