package es.uah.matcomp.mp.e4.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void constructorConCoordenadas() {
        LineSub l = new LineSub(1, 2, 3, 4);
        assertEquals(1, l.getBeginX());
        assertEquals(2, l.getBeginY());
        assertEquals(3, l.getEndX());
        assertEquals(4, l.getEndY());
    }

    @Test
    void constructorConPuntos() {
        Point begin = new Point(5, 6);
        Point end = new Point(7, 8);
        LineSub l = new LineSub(begin, end);

        assertEquals(5, l.getBeginX());
        assertEquals(6, l.getBeginY());
        assertEquals(7, l.getEndX());
        assertEquals(8, l.getEndY());
    }

    @Test
    void getBegin() {
        LineSub l = new LineSub(1, 2, 3, 4);
        Point begin = l.getBegin();
        assertEquals(1, begin.getX());
        assertEquals(2, begin.getY());
    }

    @Test
    void getEnd() {
        LineSub l = new LineSub(1, 2, 3, 4);
        Point end = l.getEnd();
        assertEquals(3, end.getX());
        assertEquals(4, end.getY());
    }

    @Test
    void setBegin() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setBegin(10, 20);
        assertEquals(10, l.getBeginX());
        assertEquals(20, l.getBeginY());
    }

    @Test
    void setEnd() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setEnd(30, 40);
        assertEquals(30, l.getEndX());
        assertEquals(40, l.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setBeginX(9);
        assertEquals(9, l.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setBeginY(11);
        assertEquals(11, l.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setBeginXY(12, 13);
        assertEquals(12, l.getBeginX());
        assertEquals(13, l.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setEndX(15);
        assertEquals(15, l.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setEndY(16);
        assertEquals(16, l.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l = new LineSub(1, 2, 3, 4);
        l.setEndXY(17, 18);
        assertEquals(17, l.getEndX());
        assertEquals(18, l.getEndY());
    }

    @Test
    void getLength() {
        LineSub l = new LineSub(0, 0, 3, 4);
        assertEquals(5.0, l.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        LineSub l = new LineSub(0, 0, 1, 1);
        assertEquals(Math.atan2(1, 1), l.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        LineSub l = new LineSub(1, 2, 3, 4);
        assertEquals("Begin: (1, 2) End: (3, 4)", l.toString());
    }
}