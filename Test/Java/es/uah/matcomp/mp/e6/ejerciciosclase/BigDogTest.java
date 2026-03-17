package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greetingSinUpcast() {
        BigDog b = new BigDog();
        b.greeting();
    }

    @Test
    void greetingConUpcastAnimal() {
        Animal a = new BigDog(); // upcasting
        a.greeting();
    }

    @Test
    void greetingConUpcastDog() {
        Dog d = new BigDog(); // upcasting
        d.greeting();
    }

    @Test
    void greetingSobrecargado() {
        BigDog b1 = new BigDog();
        Dog b2 = new BigDog();
        b1.greeting(b2);
    }
}