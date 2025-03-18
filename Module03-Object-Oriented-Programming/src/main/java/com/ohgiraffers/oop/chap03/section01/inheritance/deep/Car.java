package com.ohgiraffers.oop.chap03.section01.inheritance.deep;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        this.engine.start();
        this.engine.increaseSpeed();
        System.out.println("오빠 차 뽑았다~");
    }
}
