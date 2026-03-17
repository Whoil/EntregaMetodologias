package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c = new Cylinder(5);
        assertEquals(5, c.getHeight());
    }
    @Test
    void Cylinder(){
        Cylinder c = new Cylinder();

        assertEquals(1.0, c.getHeight());
        assertEquals(1.0, c.getRadius());
    }

    @Test
    void getArea() {
        Cylinder c = new Cylinder(2, 3);

        double expected = 2 * Math.PI * 2 * 3 + 2 * (Math.PI * Math.sqrt(2));
        assertEquals(expected, c.getArea());
    }

    @Test
    void getVolume() {
        Cylinder c = new Cylinder(2, 3);

        double expected = (Math.PI * Math.sqrt(2)) * 3;
        assertEquals(expected, c.getVolume());
    }

    @Test
    void testToString() {
        Cylinder c = new Cylinder(2, 3);

        assertEquals(
                "Cylinder: subclass of Circle[ color=red,radius=2.0] height=3.0",
                c.toString());
    }
}