package es.uah.matcomp.mp.e2.ejerciciosclases.tres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Luis", 'M');

        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(1, "Luis", 'M');

        assertEquals("Luis", customer.getName());
    }

    @Test
    void getGender() {
        Customer customer = new Customer(1, "Luis", 'M');

        assertEquals('M', customer.getGender());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Luis", 'M');

        assertEquals("Luis(1)", customer.toString());
    }
}