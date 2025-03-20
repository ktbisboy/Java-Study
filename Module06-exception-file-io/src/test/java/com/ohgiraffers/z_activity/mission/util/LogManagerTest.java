package com.ohgiraffers.z_activity.mission.util;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LogManagerTest {
    private String record1;
    private String record2;
    private static Path file;

    @BeforeAll
    static void setup() throws IOException {
        file = Files.createTempFile("test_transaction", ".log");
    }

    @BeforeEach
    void createFile() {
        record1 = "test_transaction1";
        record2 = "test_transaction2";
    }

    @Test
    public void testLogTransaction() throws IOException {
        LogManager.logTransaction(record1, file.toString());
        LogManager.logTransaction(record2, file.toString());
        List<String> lines = Files.readAllLines(file);
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).contains("test_transaction1"));
        assertTrue(lines.get(1).contains("test_transaction2"));
    }

    @Test
    public void testLogTransaction_InvalidPath() {
        // 잘못된 파일 경로를 지정하여 IOException 발생 여부 확인
        String record = "Invalid Path record";
        assertDoesNotThrow(() -> {
            LogManager.logTransaction(record, "///invalid_path///transaction.log");
        });
    }

    @AfterEach
    void tearDown() {
        record1 = null;
        record2 = null;
    }

    @AfterAll
    static void tearDownAll() throws IOException {
        Files.deleteIfExists(file);
    }
}