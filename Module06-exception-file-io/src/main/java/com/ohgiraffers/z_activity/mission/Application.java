package com.ohgiraffers.z_activity.mission;

import com.ohgiraffers.z_activity.mission.util.LogManager;

public class Application {
    public static void main(String[] args) {
        String record1 = "2025-03-20, 대출, 사용자ID: 12345, 도서명: '자바의 정석'";
        String record2 = "2025-03-21, 반납, 사용자ID: 12345, 도서명: '자바의 정석'";
        String filePath = "transaction.log";

        LogManager.logTransaction(record1, filePath);
        LogManager.logTransaction(record2, filePath);
    }
}
