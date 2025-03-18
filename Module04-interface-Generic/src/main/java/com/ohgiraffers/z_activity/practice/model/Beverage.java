package com.ohgiraffers.z_activity.practice.model;

import com.ohgiraffers.z_activity.practice.service.Discountable;

public class Beverage extends FoodItem implements Discountable {
    private double discountPrice;

    public Beverage(String name, double price, double discountPrice) {
        super(name, price);
        this.discountPrice = discountPrice;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() - discountPrice;
    }
}
