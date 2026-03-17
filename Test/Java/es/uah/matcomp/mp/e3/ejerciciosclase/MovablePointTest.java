package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        assertEquals(3, p.getxSpeed());

    }
    @Test
    void MovablePoint(){
        MovablePoint p = new MovablePoint(3, 4);

        assertEquals(3, p.getxSpeed());
        assertEquals(4, p.getySpeed());
    }

    @Test
    void setxSpeed() {
        MovablePoint p = new MovablePoint();
        p.setxSpeed(5);
        assertEquals(5, p.getxSpeed());
    }

    @Test
    void getySpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        assertEquals(4, p.getySpeed());
    }

    @Test
    void setySpeed() {
        MovablePoint p = new MovablePoint();
        p.setySpeed(6);
        assertEquals(6, p.getySpeed());

    }

    @Test
    void getSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        assertArrayEquals(new float[]{3, 4}, p.getSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p = new MovablePoint();
        p.setSpeed(7, 8);
        assertArrayEquals(new float[]{7, 8}, p.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(1, 2, 1, 1);
        p.move();

        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
    }

    @Test
    void move() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        assertEquals("(1.0,2.0), speed=(3.0,4.0)", p.toString());
    }
}