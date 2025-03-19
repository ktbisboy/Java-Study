package com.ohgiraffers.z_activity.mission.model;

import com.ohgiraffers.z_activity.mission.service.Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager implements Manager {
    private Map<String, List<Book>> rentalMap;

    public RentalManager() {
        rentalMap = new HashMap<>();
    }

    @Override
    public void rentBook(String memberId, Book book) {
        rentalMap.putIfAbsent(memberId, new ArrayList<>());
        rentalMap.get(memberId).add(book);
    }

    @Override
    public String getRentalList(String memberId) {
        String result = "";

        for (Map.Entry<String, List<Book>> entry : rentalMap.entrySet()) {
            if (entry.getKey().equals(memberId)) {
                result += "회원ID: " + memberId + " -> 대여 도서: ";
                for (Book book : entry.getValue()) {
                    result += "[" + book.getTitle() + "]; ";
                }
            }
        }

        return result;
    }
}
