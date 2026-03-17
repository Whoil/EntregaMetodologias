package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m = new Mammal("mamífero");
        assertEquals("Mammal[Animal[name=mamífero]]", m.toString());
    }
}