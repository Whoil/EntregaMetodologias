package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle3Test {

    @Test
    void getRadius() {
        Circle3 c = new Circle3(2);
        assertEquals(2, c.getRadius());
    }

    @Test
    void setRadius() {
        Circle3 c = new Circle3();
        c.setRadius(5);
        assertEquals(5, c.getRadius());
    }

    @Test
    void getArea() {
        Circle3 c = new Circle3(2, "blue");
        assertEquals("blue", c.getColor());
    }

    @Test
    void getColor() {
        Circle3 c = new Circle3();
        c.setColor("green");
        assertEquals("green", c.getColor());
    }

    @Test
    void setColor() {
        Circle3 c = new Circle3(4);

        assertEquals(Math.PI * Math.sqrt(4), c.getArea());
    }

    @Test
    void testToString() {
        Circle3 c = new Circle3(2, "blue");
        assertEquals("Circle[ color=blue,radius=2.0]", c.toString());
    }
}