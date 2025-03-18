package com.ohgiraffers.oop.chap02;

/*
* 캡슐화란
* - 객체의 상태(데이터)와 행동(메서드)를 하나의 단위로 묶는 것을 의미한다.
* - 외부에서 객체의 내부 상태를 직접 접근하지 못하도록 제한한다.
* - 데이터 보호를 통해 객체의 무결성을 유지한다.
* - 사용자에게 필요한 인터페이스만 제공하여 복잡성을 줄인다.
* */

import com.ohgiraffers.oop.chap02.capsule.CapsuleProduct;
import com.ohgiraffers.oop.chap02.noncapsule.Product;

public class Application {
    public static void main(String[] args) {
        Product nonCapsule = new Product();
        nonCapsule.payment = -1000;
        String result = nonCapsule.selling(10000000);
        System.out.println(result);

        CapsuleProduct capsuleProduct = new CapsuleProduct();
        capsuleProduct.setPayment(-10000);
        String result2 = capsuleProduct.selling();
        System.out.println(result2);
    }
}
