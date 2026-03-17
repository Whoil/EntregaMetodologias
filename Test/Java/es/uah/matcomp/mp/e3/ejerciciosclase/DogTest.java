package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d = new Dog("Tobby");
        d.greets();
    }

    @Test
    void greetsconanotherdog() {
        Dog d1 = new Dog("Tobby");
        Dog d2 = new Dog("Max");
        d1.greets(d2);
    }

    @Test
    void testToString() {
        Dog d = new Dog("Tobby");
        assertEquals("Dog[Mammal[Animal[name=Tobby]]]", d.toString());
    }
}