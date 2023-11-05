package org.ZhylienkovOleksii_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void testAddBook() {
        Library library = new Library();
        Book book1 = new Book("Book1", "Author1", "ISBN1", 2000);
        library.addBook(book1);
        assertTrue(library.hasBook("ISBN1"));
    }

    @Test
    void testRemoveBookByIsbn() {
        Library library = new Library();
        Book book1 = new Book("Book", "Author1", "ISBN1", 2000);
        library.addBook(book1);

        library.removeBookByIsbn("ISBN1");
        assertFalse(library.hasBook("ISBN1"));
    }
}