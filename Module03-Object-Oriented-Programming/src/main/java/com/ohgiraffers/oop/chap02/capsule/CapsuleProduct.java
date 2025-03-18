package com.ohgiraffers.oop.chap02.capsule;

public class CapsuleProduct {
    private double payment;

    public String selling() {
        if (this.payment > 0.0) {
            return this.payment + "에 가지고 가려면 그러든가.";
        } else {
            return "장사 안혀";
        }
    }

    public void setPayment(double payment) {
        if (payment == 0) {
            System.out.println("냅둬유 그냥 개나 주게");
        } else if (payment < 0) {
            System.out.println("장사는 뭐더러혀 어차피 넘주는디");
        } else {
            this.payment = payment;
        }
    }
}
