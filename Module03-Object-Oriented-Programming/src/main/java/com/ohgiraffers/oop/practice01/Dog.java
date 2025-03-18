package com.ohgiraffers.oop.practice01;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("견종 : " + breed);
    }

    public void bark() {
        System.out.println("멍멍!");
    }
}
