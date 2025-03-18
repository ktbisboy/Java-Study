package com.ohgiraffers.z_activity.practice2.model;

public abstract class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public abstract String getHabitat();
}
