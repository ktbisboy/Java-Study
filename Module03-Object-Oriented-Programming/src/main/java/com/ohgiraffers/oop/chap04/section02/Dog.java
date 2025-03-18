package com.ohgiraffers.oop.chap04.section02;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + "이 울음 소리를 냅니다. 멍멍");
    }
}
