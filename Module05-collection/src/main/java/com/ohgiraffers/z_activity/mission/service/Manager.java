package com.ohgiraffers.z_activity.mission.service;

import com.ohgiraffers.z_activity.mission.model.Book;

public interface Manager {
    void rentBook(String memberId, Book book);
    String getRentalList(String memberId);
}
