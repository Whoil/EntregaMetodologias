package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greeting() {
        Cat c = new Cat();
        c.greeting();
    }
    @Test
    void greetingUpcast() {
        Animal c = new Cat(); // esto es un upcast (variable de tipo animal con objeto Cat)
        c.greeting();
    }
}