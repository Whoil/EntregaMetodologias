package es.uah.matcomp.mp.e3.ejerciciosclase;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Animal animal = new Animal("Tobby"); // creamos el objeto
        String resultado = animal.toString();
        assertEquals("Animal[name=Tobby]", resultado); // comprobamos que toString funciona correctamente
    }
}