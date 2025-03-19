package com.ohgiraffers.z_activity.lesson.model;

import com.ohgiraffers.z_activity.lesson.service.Manager;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements Manager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean removeBook(String title) {
        boolean removed = false;

        for (Book book : books) {
            if(book.getTitle().equals(title)) {
                books.remove(book);
                removed = true;
            }
        }

        return removed;
    }

    public String listBooks() {
        String result = "";

        for (Book book : books) {
            result += "도서: [" + book.getTitle() + "], [" + book.getAuthor() + "], [" + book.getPrice() + "]; ";
        }

        return result;
    }
}
