package es.uah.matcomp.mp.e2.ejerciciosclases.dos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        assertEquals("123", book.getIsbn());

    }

    @Test
    void getName() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        assertEquals("Java", book.getName());

    }

    @Test
    void getAuthor() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        assertEquals(author, book.getAuthor());

    }

    @Test
    void getPrice() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        assertEquals(25.5, book.getPrice(), 0.0001);

    }

    @Test
    void setPrice() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        book.setPrice(30.0);

        assertEquals(30.0, book.getPrice(), 0.0001);
    }

    @Test
    void getQty() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5, 4);

        assertEquals(4, book.getQty());
    }

    @Test
    void setQty() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        book.setQty(10);

        assertEquals(10, book.getQty());

    }

    @Test
    void getAuthorName() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5);

        assertEquals("Ana", book.getAuthorName());

    }

    @Test
    void testToString() {
        Author author = new Author("Ana", "ana@mail.com");
        Book book = new Book("123", "Java", author, 25.5, 2);

        assertEquals(
                "Book [isbn=123, name=Java,Author[name=Auhtor[name=Ana, email=ana@mail.com, price=25.5, qty2",
                book.toString()
        );

    }
}