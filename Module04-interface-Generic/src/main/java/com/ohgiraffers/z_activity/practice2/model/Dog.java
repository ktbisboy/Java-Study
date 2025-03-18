package com.ohgiraffers.z_activity.practice2.model;

import com.ohgiraffers.z_activity.practice2.service.Describable;

public class Dog extends Mammal implements Describable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getHabitat() {
        return "Land";
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public String getDescription() {
        return "강아지가 짖습니다: 멍멍!";
    }
}
