package com.ohgiraffers.oop.practice01;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
