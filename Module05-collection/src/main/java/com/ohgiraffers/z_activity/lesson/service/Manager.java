package com.ohgiraffers.z_activity.lesson.service;

import com.ohgiraffers.z_activity.lesson.model.Book;

public interface Manager {
    void addBook(Book book);
    boolean removeBook(String title);
}
