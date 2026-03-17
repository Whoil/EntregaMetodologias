package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import es.uah.matcomp.mp.e3.ejerciciosclase.Person; // importamos la clase porque java no la encontraba


class PersonTest {

    @Test
    void getName() {
        Person p = new Person("Álvaro","Alcalá");
        assertEquals("Álvaro", p.getName());
    }

    @Test
    void getAddress() {
        Person p = new Person("Guille", "Alcalá");
        assertEquals("Alcalá", p.getAddress());
    }

    @Test
    void setAddress() {
        Person p = new Person("Héctor", "Alcalá de Henares");
        p.setAddress("Alcalá de Henares");
        assertEquals("Alcalá de Henares", p.getAddress());
    }

    @Test
    void testToString() {
        Person p = new Person("Mario", "Madrid");
        assertEquals("Person[name=Mario,address=Madrid]", p.toString());
    }
}