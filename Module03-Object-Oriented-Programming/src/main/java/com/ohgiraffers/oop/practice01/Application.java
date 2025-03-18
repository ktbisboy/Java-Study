package com.ohgiraffers.oop.practice01;

public class Application {
    public static void main(String[] args) {
        Pet pet = new Pet("펫", 0);
        pet.printInfo();

        Dog dog = new Dog("초코", 3, "푸들");
        dog.printInfo();
        dog.bark();

        Cat cat = new Cat("나비", 2, "쥐 장난감");
        cat.printInfo();
        cat.meow();
    }
}