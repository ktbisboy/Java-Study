package com.ohgiraffers.z_activity.practice.model;

import com.ohgiraffers.z_activity.practice.service.Discountable;

public class FastFood extends FoodItem implements Discountable {
    private double discountPercent;

    public FastFood(String name, double price, double discountPercent) {
        super(name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discountPercent);
    }
}
