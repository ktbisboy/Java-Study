package com.ohgiraffers.oop.practice01;

public class Cat extends Pet {
    private String favoriteToy;

    public Cat(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("좋아하는 장난감 : " + favoriteToy);
    }

    public void meow() {
        System.out.println("야옹~");
    }
}
