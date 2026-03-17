package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greeting() {
        Dog d = new Dog();
        d.greeting();
    }

    @Test
    void greetingUpcasting() {
        Animal d = new Dog(); //upcasting
        d.greeting();
    }

    @Test
    void greetingSobrecargado() {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.greeting(d2);
    }
}