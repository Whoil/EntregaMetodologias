package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle c = new MovableCircle(1, 2, 3, 4, 5);
        assertEquals("(1,2) speed=(3,4), radius=5", c.toString());
    }

    @Test
    void moveUp() {
        MovableCircle c = new MovableCircle(1, 2, 3, 4, 5);
        c.moveUp();
        assertEquals("(1,6) speed=(3,4), radius=5", c.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c = new MovableCircle(1, 10, 3, 4, 5);
        c.moveDown();
        assertEquals("(1,6) speed=(3,4), radius=5", c.toString());
    }

    @Test
    void moveRight() {
        MovableCircle c = new MovableCircle(1, 2, 3, 4, 5);
        c.moveRight();
        assertEquals("(4,2) speed=(3,4), radius=5", c.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle c = new MovableCircle(10, 2, 3, 4, 5);
        c.moveLeft();
        assertEquals("(7,2) speed=(3,4), radius=5", c.toString());
    }
}