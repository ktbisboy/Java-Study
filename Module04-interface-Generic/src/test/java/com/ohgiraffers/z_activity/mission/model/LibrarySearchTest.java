package com.ohgiraffers.z_activity.mission.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarySearchTest {
    private Book[] books;
    private LibrarySearch librarySearch;
    String keyword;

    @BeforeEach
    void setUp() {
        books = new Book[] {
                new Book("Effective Java", "Joshua Bloch", 45000),
                new Book("Java Concurrency in Practice", "Brian Goetz", 52000),
                new Book("Clean Code", "Robert C. Martin", 40000),
                new Book("The Pragmatic Programmer", "Andrew Hunt", 38000),
                new Book("Refactoring", "Martin Fowler", 48000)
        };
        librarySearch = new LibrarySearch(books);
        keyword = "Java";
    }

    @Test
    void testSearchBooks1() {
        String result = librarySearch.searchBooks(keyword);

        Assertions.assertTrue(result.contains("Effective Java"));
        Assertions.assertTrue(result.contains("Java Concurrency in Practice"));
    }

    @Test
    void testSearchBooks2() {
        String result = librarySearch.searchBooks(keyword);

        Assertions.assertEquals("책 제목 : Effective Java, 책 저자 : Joshua Bloch, 책 가격 : 45000.0;\n" +
                "책 제목 : Java Concurrency in Practice, 책 저자 : Brian Goetz, 책 가격 : 52000.0;\n", result);
    }

    @AfterEach
    void tearDown() {
        books = null;
        librarySearch = null;
    }

}