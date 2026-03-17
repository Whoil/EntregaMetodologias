package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greetingDog() { //Animal es una clase abstracta, hay que testear con las clases hijas
        Animal d = new Dog();
        d.greeting(); // Es un polimorfismo, con d y c el metodo se comporta de forma distinta
    }
    @Test
    void greetingCat() { // Ahora con la otra clase hija
        Animal c = new Cat();
        c.greeting();
    }
}