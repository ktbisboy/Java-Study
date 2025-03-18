package com.ohgiraffers.z_activity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BookInventoryCalculatorTest {
    private BookInventoryCalculator bookInventoryCalculator;
    private Book[] books;

    @BeforeEach
    void setUp() {
        Book[] books = new Book[] {
                new PrintedBook("Java Programming", "Author A", 50.0, 5.0),
                new Ebook("Effective Java", "Author B", 70.0, 0.1),
                new PrintedBook("Clean Code", "Author C", 65.0, 7.0),
        };

        bookInventoryCalculator = new BookInventoryCalculator(books);
    }

    @Test
    void testCalculateInventory() {
        String result = bookInventoryCalculator.CalculateInventory();

        Assertions.assertTrue(result.contains("총 재고 가치: 190.0"));
        Assertions.assertTrue(result.contains("최고가 도서: Clean Code"));
        Assertions.assertTrue(result.contains("최저가 도서: Java Programming"));
    }

    @AfterEach
    void tearDown() {
        books = null;
        bookInventoryCalculator = null;
    }
  
}