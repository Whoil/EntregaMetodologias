package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p = new Point3D(1, 2, 3);
        assertEquals(3, p.getZ());

    }

    @Test
    void setZ() {
        Point3D p = new Point3D();
        p.setZ(5);
        assertEquals(5, p.getZ());

    }

    @Test
    void getXYZ() {
        Point3D p = new Point3D();
        p.setZ(5);
        assertEquals(5, p.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p = new Point3D();
        p.setXYZ(4, 5, 6);
        assertArrayEquals(new float[]{4, 5, 6}, p.getXYZ());
    }

    @Test
    void testToString() {
        Point3D p = new Point3D(1, 2, 3);
        assertEquals("(1.0,2.0,3.0)", p.toString());
    }
}