package org.ZhylienkovOleksii_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void testBookConstructor() {
        String title = "Sample Book";
        String author = "John Doe";
        String isbn = "1234567890";
        int year = 2022;

        Book book = new Book(title, author, isbn, year);

        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(isbn, book.getIsbn());
        assertEquals(year, book.getYear());
    }

    @Test
    public void testGetTitle() {
        Book book = new Book("Book1", "Author1", "ISBN1", 2000);
        assertEquals("Book1", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        Book book = new Book("Book2", "Author2", "ISBN2", 2010);
        assertEquals("Author2", book.getAuthor());
    }

    @Test
    public void testGetIsbn() {
        Book book = new Book("Book3", "Author3", "ISBN3", 2020);
        assertEquals("ISBN3", book.getIsbn());
    }

    @Test
    public void testGetYear() {
        Book book = new Book("Book4", "Author4", "ISBN4", 2030);
        assertEquals(2030, book.getYear());
    }
}