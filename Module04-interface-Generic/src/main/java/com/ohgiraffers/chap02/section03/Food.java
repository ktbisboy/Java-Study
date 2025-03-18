package com.ohgiraffers.chap02.section03;

public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
