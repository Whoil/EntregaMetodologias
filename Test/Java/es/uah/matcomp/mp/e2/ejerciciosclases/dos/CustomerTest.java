package es.uah.matcomp.mp.e2.ejerciciosclases.dos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Luis", 10);

        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(1, "Luis", 10);

        assertEquals("Luis", customer.getName());
    }

    @Test
    void getDiscount() {

        Customer customer = new Customer(1, "Luis", 10);

        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(1, "Luis", 10);
        customer.setDiscount(25);

        assertEquals(25, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Luis", 10);

        assertEquals("Luis(1)(10%)", customer.toString());
    }
}