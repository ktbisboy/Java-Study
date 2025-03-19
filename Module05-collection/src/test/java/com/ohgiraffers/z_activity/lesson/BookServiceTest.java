package com.ohgiraffers.z_activity.lesson;

import com.ohgiraffers.z_activity.lesson.model.Book;
import com.ohgiraffers.z_activity.lesson.model.BookManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookServiceTest {
    private BookManager bookManager;

    @BeforeEach
    public void setUp() {
        bookManager = new BookManager();
        bookManager.addBook(new Book("Clean Code", "Robert C. Martin", 45.0));
        bookManager.addBook(new Book("Effective Java", "Joshua", 55.0));
    }

    @AfterEach
    public void tearDown() {
        bookManager = null;
    }

    @Test
    public void testAddBook() {
        String list = bookManager.listBooks();
        Assertions.assertTrue(list.contains("Clean Code"));
        Assertions.assertTrue(list.contains("Effective Java"));
    }

    @Test
    public void testRemoveBook() {
        boolean removed = bookManager.removeBook("Clean Code");
        Assertions.assertTrue(removed);

        String list = bookManager.listBooks();
        Assertions.assertFalse(list.contains("Clean Code"));
    }

    @Test
    public void testListBooks() {
        String expected = "도서: [Clean Code], [Robert C. Martin], [45.0]; 도서: [Effective Java], [Joshua], [55.0]; ";
        String result = bookManager.listBooks();
        Assertions.assertEquals(expected, result);
    }
}