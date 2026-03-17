package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F'),
                new Author("Luis", "luis@mail.com", 'M')
        };
        Book book = new Book("Java", authors, 20.0);

        assertEquals("Java", book.getName());

    }

    @Test
    void getAuthors() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F'),
                new Author("Luis", "luis@mail.com", 'M')
        };
        Book book = new Book("Java", authors, 20.0);

        assertArrayEquals(authors, book.getAuthors());

    }

    @Test
    void getPrice() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F')
        };
        Book book = new Book("Java", authors, 20.0);

        assertEquals(20.0, book.getPrice(), 0.0001);

    }

    @Test
    void setPrice() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F')
        };
        Book book = new Book("Java", authors, 20.0);

        book.setPrice(35.5);

        assertEquals(35.5, book.getPrice(), 0.0001);
    }

    @Test
    void getQty() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F')
        };
        Book book = new Book("Java", authors, 20.0, 5);

        assertEquals(5, book.getQty());
    }

    @Test
    void setQty() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F')
        };
        Book book = new Book("Java", authors, 20.0);

        book.setQty(8);

        assertEquals(8, book.getQty());

    }

    @Test
    void getAuthorNames() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F'),
                new Author("Luis", "luis@mail.com", 'M')
        };
        Book book = new Book("Java", authors, 20.0);

        assertEquals("Ana, Luis", book.getAuthorNames());
    }

    @Test
    void testToString() {
        Author[] authors = {
                new Author("Ana", "ana@mail.com", 'F'),
                new Author("Luis", "luis@mail.com", 'M')
        };
        Book book = new Book("Java", authors, 20.0, 3);

        assertEquals("Book[ name=Java, authors=Ana, Luis,price=20.0,qty=3]", book.toString());
    }

}