package com.ohgiraffers.z_activity.practice;

import com.ohgiraffers.z_activity.practice.model.Beverage;
import com.ohgiraffers.z_activity.practice.model.FastFood;
import com.ohgiraffers.z_activity.practice.model.FoodDiscountCalculator;
import com.ohgiraffers.z_activity.practice.service.Discountable;

public class Application {
    public static void main(String[] args) {
        Discountable[] items = new Discountable[] {
                new FastFood("Burger", 5000, 0.1),
                new FastFood("Fries", 2500, 0.1),
                new Beverage("Cola", 2000, 500),
                new Beverage("Coffee", 3000, 500),
        };
        FoodDiscountCalculator foodDiscountCalculator = new FoodDiscountCalculator(items);
        String result = foodDiscountCalculator.calDiscountedPrices(items);
        System.out.println(result);
    }
}
