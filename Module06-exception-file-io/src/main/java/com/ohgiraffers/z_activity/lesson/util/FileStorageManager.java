package com.ohgiraffers.z_activity.lesson.util;

import com.ohgiraffers.z_activity.lesson.model.Book;
import com.ohgiraffers.z_activity.lesson.model.Member;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageManager {

    public static void saveBooksToFile(List<Book> books, String filePath) {
        // Book 객체와 LibraryMember 객체의 정보를 파일(예: "books.txt", "members.txt")에 저장한다.
        // 도서 정보를 담은 Book 객체 리스트
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("도서 파일 저장 중 오류 발생 : " + e.getMessage());
        }
    }

    public static void saveMembersToFile(List<Member> members, String filePath) {
        // Book 객체와 LibraryMember 객체의 정보를 파일(예: "books.txt", "members.txt")에 저장한다.
        // 회원 정보를 담은 LibraryMember 객체 리스트
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Member member : members) {
                writer.write(member.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("회원 파일 저장 중 오류 발생 : " + e.getMessage());
        }
    }
}
