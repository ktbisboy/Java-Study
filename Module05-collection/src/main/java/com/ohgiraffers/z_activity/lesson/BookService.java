package com.ohgiraffers.z_activity.lesson;

import com.ohgiraffers.z_activity.lesson.model.Book;
import com.ohgiraffers.z_activity.lesson.model.BookManager;

public class BookService {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("Clean Code", "Robert C. Martin", 45.0));
        bookManager.addBook(new Book("Effective Java", "Joshua", 55.0));

        System.out.println(bookManager.listBooks());

        bookManager.removeBook("Clean Code");
        System.out.println(bookManager.listBooks());
    }
}
