package com.ohgiraffers.z_activity;

public class BookInventoryCalculator {

    private Book[] books;

    public BookInventoryCalculator(Book[] books) {
        this.books = books;
    }

    public String CalculateInventory() {
        double totalPrice = 0;
        double highestPrice = books[0].getBasePrice();
        double lowestPrice = books[0].getBasePrice();
        String highestPriceBook = books[0].getTitle();
        String lowestPriceBook = books[0].getTitle();

        int length = books.length;
        for (int i = 0; i < length; i++) {
            double price = books[i].getFinalPrice();
            totalPrice += price;

            if (price > highestPrice) {
                highestPrice = price;
                highestPriceBook = books[i].getTitle();
            }

            if (price < lowestPrice) {
                lowestPrice = price;
                lowestPriceBook = books[i].getTitle();
            }
        }

        double averagePrice = totalPrice / length;
        return "총 재고 가치: " + totalPrice + ", 평균 가격: " + averagePrice + ", 최고가 도서: " + highestPriceBook + ", 최저가 도서: "
                + lowestPriceBook;
    }
}
