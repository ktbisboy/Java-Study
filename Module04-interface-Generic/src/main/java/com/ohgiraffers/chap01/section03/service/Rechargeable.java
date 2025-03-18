package com.ohgiraffers.chap01.section03.service;

public interface Rechargeable {
    void recharge();

    default void DefaultRecharge() {
        System.out.println("기본 충전 중!");
    }
}
