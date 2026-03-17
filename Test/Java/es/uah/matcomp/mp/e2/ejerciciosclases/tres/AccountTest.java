package es.uah.matcomp.mp.e2.ejerciciosclases.tres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        assertEquals(10, account.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        assertSame(customer, account.getCustomer());
    }

    @Test
    void getBalance() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        assertEquals(100.0, account.getBalance());
    }

    @Test
    void setBalance() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        account.setBalance(200.0);

        assertEquals(200.0, account.getBalance());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        assertEquals("Ana", account.getCustomerName());
    }

    @Test
    void deposit() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        Account result = account.deposit(50.0);

        assertSame(account, result);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void withdraw() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        Account result = account.withdraw(40.0);

        assertSame(account, result);
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void withdrawSinSaldoSuficiente() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        Account result = account.withdraw(150.0);

        assertSame(account, result);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void constructorSinBalance() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer);

        assertEquals(10, account.getId());
        assertSame(customer, account.getCustomer());
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Ana", 'F');
        Account account = new Account(10, customer, 100.0);

        assertEquals("Ana(1)balance=$100.00", account.toString());
    }
}