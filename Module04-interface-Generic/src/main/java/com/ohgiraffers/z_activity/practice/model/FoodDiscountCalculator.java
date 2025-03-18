package com.ohgiraffers.z_activity.practice.model;

import com.ohgiraffers.z_activity.practice.service.Discountable;

public class FoodDiscountCalculator {
    private Discountable[] items;

    public FoodDiscountCalculator(Discountable[] items) {
        this.items = items;
    }

    public <T extends Discountable> String calDiscountedPrices(T[] items) {
        double sum = 0;
        double avg = 0;

        for (Discountable item : items) {
            sum += item.getDiscountedPrice();
        }
        avg = sum / items.length;


        return "총 할인 가격: " + sum + ", 평균 할인 가격: " + avg;
    }
}
