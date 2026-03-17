package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 5);
        MyLine line = new MyLine(begin, end);

        assertSame(begin, line.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 5);
        MyLine line = new MyLine(begin, end);

        MyPoint nuevoBegin = new MyPoint(2, 2);

        line.setBegin(nuevoBegin);

        assertSame(nuevoBegin, line.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 5);
        MyLine line = new MyLine(begin, end);

        assertSame(end, line.getEnd());
    }

    @Test
    void setEnd() {
        MyLine line = new MyLine(1, 1, 4, 5);
        MyPoint end = new MyPoint(6, 6);

        line.setEnd(end);

        assertSame(end, line.getEnd());
    }

    @Test
    void getBeginX() {
        MyLine line = new MyLine(1, 1, 4, 5);
        MyPoint end = new MyPoint(6, 6);

        line.setEnd(end);

        assertSame(end, line.getEnd());
    }

    @Test
    void setBeginX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginX(7);

        assertEquals(7, line.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(2, line.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginY(8);

        assertEquals(8, line.getBeginY());

    }

    @Test
    void getEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(3, line.getEndX());
    }

    @Test
    void setEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndX(9);

        assertEquals(9, line.getEndX());
    }

    @Test
    void setEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndY(10);

        assertEquals(10, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertArrayEquals(new int[]{1, 2}, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginXY(5, 6);

        assertArrayEquals(new int[]{5, 6}, line.getBeginXY());
    }

    @Test
    void getEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertArrayEquals(new int[]{3, 4}, line.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndXY(7, 8);

        assertArrayEquals(new int[]{7, 8}, line.getEndXY());
    }

    @Test
    void getLength() {
        MyLine line = new MyLine(0, 0, 3, 4);

        assertEquals(5.0, line.getLength());
    }

    @Test
    void getGradient() {
        MyLine line = new MyLine(0, 0, 1, 1);

        assertEquals(Math.atan2(1, 1), line.getGradient());
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals("MyLine [begin=(1,2), end=(3,4)]", line.toString());
    }
}