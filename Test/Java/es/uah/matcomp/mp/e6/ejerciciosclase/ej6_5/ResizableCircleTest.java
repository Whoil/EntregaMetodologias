package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle c = new ResizableCircle(5);
        assertNotNull(c.toString());
    }

    @Test
    void resize() {
        ResizableCircle c = new ResizableCircle(5);

        c.resize(200);

        // comprobamos el cambio usando el perímetro
        assertEquals(2 * Math.PI * 2, c.getPerimeter());
    }
}