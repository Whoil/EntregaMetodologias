package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c = new Cat("Tobby");
        c.greets();
    }

    @Test
    void testToString() {
        Cat c = new Cat("Gato");
        String resultado = c.toString();

        assertEquals("Cat[Mammal[Animal[name=Gato]]]", resultado);
    }
}