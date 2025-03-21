package com.ohgiraffers.z_activity.mission.model;

import com.ohgiraffers.z_activity.lesson.service.Discountable;
import com.ohgiraffers.z_activity.mission.service.Searchable;

public class Book implements Searchable {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean matches(String keyword) {
        return title.contains(keyword);
    }
}
