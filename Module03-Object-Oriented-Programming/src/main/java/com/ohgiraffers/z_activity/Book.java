package com.ohgiraffers.z_activity;

public abstract class Book {

    private String title;
    private String author;
    private double basePrice;

    public abstract double getFinalPrice();

    public Book(String title, String author, double basePrice) {
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
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

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
