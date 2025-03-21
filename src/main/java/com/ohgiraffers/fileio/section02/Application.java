package com.ohgiraffers.fileio.section02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("저장할 메시지를 입력해주세요 : ");
        String message = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_info.text"))
             // Scanner sc = new Scanner(message) 이렇게도 가능함.
        ) {
            writer.write("사용자 입력 : " + message);
            writer.newLine();
            writer.write("작성 시간 : " + java.time.LocalDateTime.now());
            writer.flush();
            System.out.println("파일 저장 완료");
        } catch (IOException e) {
            System.out.println("파일 저장 실패 : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
