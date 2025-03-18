package com.ohgiraffers.chap02.section01;

public class Application {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.setItem("hello");
        String text = (String) box.getItem();
        System.out.println(text);

        box.setItem(122);
        System.out.println(box.getItem());
        // 런타임 에러 : Int -> String 변환 불가
        String number = (String) box.getItem();
        System.out.println(number);
    }
}
