package es.uah.matcomp.mp.e4.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(5.0);
        assertEquals(5.0, c.getRadius(), 0.0001);
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, c.getArea(), 0.0001);
    }

    @Test
    void getColor() {
        Circle c = new Circle(3.0, "blue");
        assertEquals("blue", c.getColor());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(4.0);
        assertEquals(4.0, c.getRadius(), 0.0001);
    }

    @Test
    void setColor() {
        Circle c = new Circle();
        c.setColor("green");
        assertEquals("green", c.getColor());
    }

    @Test
    void testToString() {
        Circle c = new Circle(3.0, "yellow");
        assertEquals("[radius=3.0 color=yellow]", c.toString());
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(2.0);
        assertEquals(2 * Math.PI * 2.0, c.getCircumference(), 0.0001);
    }
}