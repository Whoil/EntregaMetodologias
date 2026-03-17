package es.uah.matcomp.mp.e2.ejerciciosclases.dos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Ana", "ana@mail.com");

        assertEquals("Ana", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Ana", "ana@mail.com");

        assertEquals("ana@mail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Ana", "ana@mail.com");
        author.setEmail("nuevo@mail.com");

        assertEquals("nuevo@mail.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("Ana", "ana@mail.com");

        assertEquals("Auhtor[name=Ana, email=ana@mail.com", author.toString());
    }
}