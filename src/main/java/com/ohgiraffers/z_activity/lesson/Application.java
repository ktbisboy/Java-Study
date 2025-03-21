package com.ohgiraffers.z_activity.lesson;

import com.ohgiraffers.z_activity.lesson.model.Book;
import com.ohgiraffers.z_activity.lesson.model.Member;
import com.ohgiraffers.z_activity.lesson.util.FileStorageManager;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 도서 정보를 담은 Book 객체 리스트
        List<Book> books = List.of(
                new Book("Clean Code", "Robert C. Martin", 45.0),
                new Book("Effective Java", "Joshua Bloch", 55.0)
        );
        // 회원 정보를 담은 LibraryMember 객체 리스트
        List<Member> members = List.of(
                new Member("Alice", "LM001"),
                new Member("Bob", "LM002")
        );

        FileStorageManager.saveBooksToFile(books, "books.txt");
        FileStorageManager.saveMembersToFile(members, "members.txt");
    }
}
