package com.ohgiraffers.z_activity.mission.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogManager {
    public static void logTransaction(String record, String filePath) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.append(record);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("로그 파일 저장 중 오류 발생 : " + e.getMessage());
        }
    }
}
