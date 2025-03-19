package com.ohgiraffers.z_activity.mission;

import com.ohgiraffers.z_activity.mission.model.Book;
import com.ohgiraffers.z_activity.mission.model.LibraryMember;
import com.ohgiraffers.z_activity.mission.model.RentalManager;

public class Application {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", 50.0);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 60.0);
        Book book3 = new Book("클린 코드", "Robert C. Martin", 55.0);

        LibraryMember member1 = new LibraryMember("LM001", "홍길동");
        LibraryMember member2 = new LibraryMember("LM002", "김철수");

        RentalManager rentalManager = new RentalManager();
        rentalManager.rentBook("LM001", book1);
        rentalManager.rentBook("LM001", book2);
        rentalManager.rentBook("LM002", book3);

        System.out.println(rentalManager.getRentalList("LM001"));
        System.out.println(rentalManager.getRentalList("LM002"));
    }
}
