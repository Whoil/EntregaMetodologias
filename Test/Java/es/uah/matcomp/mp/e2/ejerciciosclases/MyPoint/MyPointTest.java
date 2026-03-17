package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint point = new MyPoint(2, 3);

        assertEquals(2, point.getX());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint();
        point.setX(5);

        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint(2, 3);

        assertEquals(3, point.getY());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint();
        point.setY(7);

        assertEquals(7, point.getY());
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(3, 4);

        assertArrayEquals(new int[]{3, 4}, point.getXY());
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint();
        point.setXY(8, 9);

        assertEquals(8, point.getX());
        assertEquals(9, point.getY());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(3, 4);

        assertEquals("(3,4)", point.toString());
    }

    @Test
    void distance() {
        MyPoint point = new MyPoint(3, 4);

        assertEquals(5.0, point.distance(0, 0), 0.0001);
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(0, 0);

        assertEquals(5.0, p1.distance(p2), 0.0001);
    }

    @Test
    void testDistance1() { MyPoint point = new MyPoint(3, 4);

        assertEquals(5.0, point.distance(), 0.0001);
    }
}