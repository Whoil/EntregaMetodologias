package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        assertEquals(1, b.getX());
    }

    @Test
    void setX() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        b.setX(3);
        assertEquals(3, b.getX());
    }

    @Test
    void getY() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        assertEquals(2, b.getY());
    }

    @Test
    void setY() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        b.setY(4);
        assertEquals(4, b.getY());
    }

    @Test
    void getRadius() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        assertEquals(5, b.getRadius());
    }

    @Test
    void setRadius() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        b.setRadius(10);
        assertEquals(10, b.getRadius());
    }

    @Test
    void getxDelta() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.7f);
        assertEquals(0.5f, b.getxDelta());
    }

    @Test
    void setxDelta() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        b.setxDelta(1.0f);
        assertEquals(1.0f, b.getxDelta());
    }

    @Test
    void getyDelta() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.7f);
        assertEquals(0.7f, b.getyDelta());
    }

    @Test
    void setyDelta() {
        Ball b = new Ball(1, 2, 5, 0.5f, 0.5f);
        b.setyDelta(1.5f);
        assertEquals(1.5f, b.getyDelta());
    }

    @Test
    void move() {
        Ball b = new Ball(1, 2, 5, 1, 1);
        b.move();
        assertEquals(2, b.getX());
        assertEquals(3, b.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball b = new Ball(1, 2, 5, 1, 1);
        b.reflectHorizontal();
        assertEquals(-1, b.getxDelta());
    }

    @Test
    void reflectVertical() {
        Ball b = new Ball(1, 2, 5, 1, 1);
        b.reflectVertical();
        assertEquals(-1, b.getyDelta());
    }

    @Test
    void testToString() {
        Ball b = new Ball(1, 2, 5, 1, 1);
        assertEquals("Ball[(1.0,2.0),speed=(1.0,1.0)]", b.toString());
    }
}