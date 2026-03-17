package es.uah.matcomp.mp.e4.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void constructorVacio() {
        Cylinder c = new Cylinder();
        assertEquals(1.0, c.getHeight(), 0.0001);
    }

    @Test
    void constructorConHeight() {
        Cylinder c = new Cylinder(5.0);
        assertEquals(5.0, c.getHeight(), 0.0001);
    }

    @Test
    void constructorConRadiusYHeight() {
        Cylinder c = new Cylinder(2.0, 5.0);
        assertEquals(5.0, c.getHeight(), 0.0001);
    }

    @Test
    void getHeight() {
        Cylinder c = new Cylinder(7.0);
        assertEquals(7.0, c.getHeight(), 0.0001);
    }

    @Test
    void getArea() {
        Cylinder c = new Cylinder(2.0, 5.0);
        double esperado = 2 * Math.PI * 2.0 * 5.0 + 2 * (Math.PI * 2.0 * 2.0);
        assertEquals(esperado, c.getArea(), 0.0001);
    }

    @Test
    void getVolume() {
        Cylinder c = new Cylinder(2.0, 5.0);
        double esperado = Math.PI * 2.0 * 2.0 * 5.0;
        assertEquals(esperado, c.getVolume(), 0.0001);
    }

    @Test
    void testToString() {
        Cylinder c = new Cylinder(2.0, 5.0);
        assertEquals("Cylinder: base of Cylinder is:  [radius=2.0 color=red] height=5.0", c.toString());
    }
}