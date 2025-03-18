package com.ohgiraffers.z_activity.mission;

import com.ohgiraffers.z_activity.mission.model.Book;
import com.ohgiraffers.z_activity.mission.model.LibrarySearch;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Effective Java", "Joshua Bloch", 45000),
                new Book("Java Concurrency in Practice", "Brian Goetz", 52000),
                new Book("Clean Code", "Robert C. Martin", 40000),
                new Book("The Pragmatic Programmer", "Andrew Hunt", 38000),
                new Book("Refactoring", "Martin Fowler", 48000)
        };
        LibrarySearch librarySearch = new LibrarySearch(books);

        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();

        String result = librarySearch.searchBooks(keyword);
        System.out.println(result);
    }
}
