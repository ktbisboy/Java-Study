package com.ohgiraffers.f_activity.lesson;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numText = sc.nextLine();

        String result = Application.calulate(numText);
        System.out.println(result);
    }

    public static String calulate(String numText) {
        //1. 입력 문자열의 공백 제거.
        numText = numText.replace(" ", "");
        //2. split() 메서드를 사용하여 쉼표로 분할한 배열을 생성.
        String[] split = numText.split(",");
        //3. 배열 인덱스 0, 1, 2의 요소를 각각 변수에 할당 후 정수형으로 변환.
        int num0 = Integer.parseInt(split[0]);
        int num1 = Integer.parseInt(split[1]);
        int num2 = Integer.parseInt(split[2]);
        //4. 변수들을 이용해 합계와 평균을 계산.
        int sum = num0 + num1 + num2;
        int avg = sum / 3;
        //5. 결과 문자열을 생성하여 반환.

        return "합계: " + sum + ", 평균: " + avg;
    }
}
