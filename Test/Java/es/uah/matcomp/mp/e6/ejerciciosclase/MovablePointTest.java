package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        assertEquals("(1,2) speed=(3,4)", p.toString());
    }

    @Test
    void moveUp() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        p.moveUp();
        assertEquals("(1,6) speed=(3,4)", p.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p = new MovablePoint(1, 10, 3, 4);
        p.moveDown();
        assertEquals("(1,6) speed=(3,4)", p.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        p.moveRight();
        assertEquals("(4,2) speed=(3,4)", p.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p = new MovablePoint(10, 2, 3, 4);
        p.moveLeft();
        assertEquals("(7,2) speed=(3,4)", p.toString());
    }
}