package com.ohgiraffers.f_activity.mission;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String result = Application.caculate(text);
        System.out.println(result);
    }

    public static String caculate(String text) {
        // 1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String[] split = text.split(" ");
        // 2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String str0 = split[0];
        String str1 = split[1];
        String str2 = split[2];
        // 3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int len0 = str0.length();
        int len1 = str1.length();
        int len2 = str2.length();
        // 4. 세 단어의 길이의 합계를 계산한다.
        int sum = len0 + len1 + len2;

        return "단어1: " + len0 + ", 단어2: " + len1 + ", 단어3: " + len2 + ", 총 길이: " + sum;
    }
}
