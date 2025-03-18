package com.ohgiraffers.z_activity.lesson.model;

import com.ohgiraffers.z_activity.lesson.service.Discountable;

public class PrintedBook extends Book implements Discountable {
    private final double discountRate;

    public PrintedBook(String title, String author, double price, double discountRate) {
        super(title, author, price);
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discountRate);
    }
}
