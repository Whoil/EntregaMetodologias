package es.uah.matcomp.mp.e2.ejerciciosclases.dos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(100, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {

        Customer customer1 = new Customer(1, "Luis", 10);
        Customer customer2 = new Customer(2, "Ana", 20);
        Invoice invoice = new Invoice(100, customer1, 200.0);

        invoice.setCustomer(customer2);

        assertEquals(customer2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(200.0, invoice.getAmount(), 0.0001);
    }

    @Test
    void setAmount() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        invoice.setAmount(350.0);

        assertEquals(350.0, invoice.getAmount(), 0.0001);
    }

    @Test
    void getCustomerId() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {

        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals("Luis", invoice.getCustomerName());
    }


    @Test
    void getCustomerDiscount() {

        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals(180.0, invoice.getAmountAfterDiscount(), 0.0001);
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Luis", 10);
        Invoice invoice = new Invoice(100, customer, 200.0);

        assertEquals("Invoice[id=100Luis(1)(10%), amount=200.0]", invoice.toString());
    }
}