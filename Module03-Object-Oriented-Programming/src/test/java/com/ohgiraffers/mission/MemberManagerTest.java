package com.ohgiraffers.mission;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberManagerTest {
    private MemberManager manager;
    private LibraryMember[] members;

    @BeforeEach
    void setUp() {
        members = new LibraryMember[] {
                new LibraryMember("Alice", "LM001"),
                new StudentMember("Bob", "LM002"),
        };

        manager = new MemberManager(members);
    }

    @Test
    void testPrintMembers() {
        String result = manager.printMembers();

        Assertions.assertTrue(result.contains("Alice"));
        Assertions.assertTrue(result.contains("LM001"));
        Assertions.assertTrue(result.contains("3"));
        Assertions.assertTrue(result.contains("Bob"));
        Assertions.assertTrue(result.contains("LM002"));
        Assertions.assertTrue(result.contains("5"));
    }

    @AfterEach
    void tearDown() {
        members = null;
        manager = null;
    }
}