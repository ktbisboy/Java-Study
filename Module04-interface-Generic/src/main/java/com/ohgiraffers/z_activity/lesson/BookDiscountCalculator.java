package com.ohgiraffers.z_activity.lesson;

import com.ohgiraffers.z_activity.lesson.model.Ebook;
import com.ohgiraffers.z_activity.lesson.model.PrintedBook;
import com.ohgiraffers.z_activity.lesson.service.Discountable;

public class BookDiscountCalculator {
    public static void main(String[] args) {
        Discountable[] discountables = new Discountable[] {
                new PrintedBook("Java Programming", "Author A", 50.0, 0.05),
                new Ebook("Effective Java", "Author B", 70.0, 0.2),
                new PrintedBook("Clean Code", "Author C", 65.0, 0.05),
        };
        BookDiscountCalculator.calcDiscountedPrices(discountables);
    }

    public static <T extends Discountable> void calcDiscountedPrices(T[] items) {
        double sum = 0.0;
        double avg = 0.0;

        for (Discountable item : items) {
            sum += item.getDiscountedPrice();
        }
        avg = sum / items.length;

        System.out.println("총 할인 가격: " + sum + ", 평균 할인 가격: " + avg);
    }
}
