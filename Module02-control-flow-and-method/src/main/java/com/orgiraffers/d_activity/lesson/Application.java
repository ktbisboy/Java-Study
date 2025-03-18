package com.orgiraffers.d_activity.lesson;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        String result = application.processNumbers("10, 20, 30, 40");
        System.out.println(result);
    }

    /**
    * 쉼표로 구분된 숫자 문자열을 받아 합계, 짝수 개수, 홀수 개수를 계산하여
    * 결과를 문자열로 반환하는 함수.
    *
    * @param input 쉼표로 구분된 숫자 문자열(예: 10, 20, 30, 40)
    * @return "합계:<sum>, 평균 :<avg>, 짝수 개수 : <evenCount>, 홀수 개수 : <addCount>" 형태의 결과
    * */
    public String processNumbers(String input) {
        if(input == null || input.trim().isEmpty()) {
            return "입력 없음";
        }

        //입력 문자열에서 모든 공백을 제거한다.
        String cleanedInput = input.replaceAll(" ", "");

        //쉼표(,)를 기준으로 문자열 배열을 생성한다.
        String[] parts = cleanedInput.split(",");

        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int count = parts.length;
        for (String part : parts) {
            int number = Integer.parseInt(part);
            // 합계를 구하게 됨
            sum += number;

            if (number % 2 == 0) {
                // 짝수의 개수
                evenCount++;
            } else {
                // 홀수의 개수
                oddCount++;
            }
        }
        // 평균
        int avg = sum / count;

        return "합계: " + sum + ", 평균: "+ avg + ", 짝수 개수: " + evenCount + ", 홀수 개수: " + oddCount;
    }
}
