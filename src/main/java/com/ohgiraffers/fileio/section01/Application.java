package com.ohgiraffers.fileio.section01;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("hello Ohgiraffers\n");
            writer.write("this is a test file");

            writer.flush();

            System.out.println("파일 작성 완료");

            // write.close(); <-- try()에서 닫아주기 때문에 생략 가능.
        } catch (IOException e) {
            System.out.println("파일 쓰기 실패");
        }

        try(FileReader reader = new FileReader("output.txt")) {
            int data;
            while((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 실패 " + e.getMessage());
        }
    }
}
