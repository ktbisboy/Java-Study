package com.ohgiraffers.z_activity.mission.model;

public class LibrarySearch {
    private Book[] books;

    public LibrarySearch(Book[] books) {
        this.books = books;
    }

    public String searchBooks(String keyword) {
        String result = "";

        for (Book book : books) {
            if (book.matches(keyword)) {
                result += "책 제목 : " + book.getTitle() + ", 책 저자 : " + book.getAuthor() + ", 책 가격 : " + book.getPrice() + ";\n";
            }
        }

        return result;
    }
}
