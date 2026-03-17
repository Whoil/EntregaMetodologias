package es.uah.matcomp.mp.e1.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Account a = new Account("A101", "Juan", 500);
        assertEquals("A101", a.getId());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account a = new Account("A101", "Juan", 500);
        assertEquals("Juan", a.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(0, new Account().getBalance());
        assertEquals(0, new Account("A102", "Ana").getBalance());
        assertEquals(300, new Account("A103", "Luis", 300).getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account a = new Account("A101", "Juan", 500);
        assertEquals(700, a.credit(200));
        assertEquals(700, a.getBalance());
    }

    @org.junit.jupiter.api.Test
    void debit() {
        Account a = new Account("A101", "Juan", 500);

        assertEquals(300, a.debit(200)); // caso correcto
        assertEquals(300, a.debit(400)); // caso sin saldo suficiente
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        Account a1 = new Account("A101", "Juan", 500);
        Account a2 = new Account("A102", "Ana", 200);

        assertEquals(200, a1.transferTo(a2, 300)); // transferencia válida
        assertEquals(500, a2.getBalance());

        assertEquals(200, a1.transferTo(a2, 400)); // transferencia no válida
        assertEquals(500, a2.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Account a = new Account("A101", "Juan", 500);
        assertEquals("Account[id=A101,name=Juan,balance=500]", a.toString());
    }
}