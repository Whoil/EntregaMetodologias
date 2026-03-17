package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Ana", "ana@mail.com", 'F');

        assertEquals("Ana", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Ana", "ana@mail.com", 'F');

        assertEquals("ana@mail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Ana", "ana@mail.com", 'F');
        author.setEmail("nuevo@mail.com");

        assertEquals("nuevo@mail.com", author.getEmail());
    }

    @Test
    void getGender() {
        Author author = new Author("Ana", "ana@mail.com", 'F');

        assertEquals('F', author.getGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Ana", "ana@mail.com", 'F');

        assertEquals("Author [name=Ana , email=ana@mail.com, gender=F]", author.toString());
    }
}