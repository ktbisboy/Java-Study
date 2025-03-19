package com.ohgiraffers.z_activity.mission.model;

import com.ohgiraffers.z_activity.lesson.model.BookManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalManagerTest {
    private RentalManager rentalManager;
    private Book book1;
    private Book book2;
    private LibraryMember member1;

    @BeforeEach
    void setUp() {
        rentalManager = new RentalManager();
        book1 = new Book("자바의 정석", "남궁성", 50.0);
        book2 = new Book("Effective Java", "Joshua Bloch", 60.0);
        member1 = new LibraryMember("LM001", "홍길동");
    }

    @AfterEach
    void tearDown() {
        rentalManager = null;
    }

    @Test
    void testRentBook() {
        rentalManager.rentBook("LM001", book1);

        String result = rentalManager.getRentalList("LM001");
        Assertions.assertTrue(result.contains("자바의 정석"));
    }

    @Test
    void testGetRentalList() {
        rentalManager.rentBook("LM001", book1);
        rentalManager.rentBook("LM001", book2);

        String expected = "회원ID: LM001 -> 대여 도서: [자바의 정석]; [Effective Java]; ";
        String result = rentalManager.getRentalList("LM001");
        Assertions.assertEquals(expected, result);
    }
}