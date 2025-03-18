package com.orgiraffers.d_activity.mission;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        int[] input = {1, 3, 5, 8};
        String result = application.processNumbers(input);
        System.out.println(result);
    }

    /**
     * 쉼표로 구분된 숫자 문자열을 받아 합계, 짝수 개수, 홀수 개수를 계산하여
     * 결과를 문자열로 반환하는 함수.
     *
     * @param input 정수 배열 (예: {1, 3, 5, 8})
     * @return "요일, 요일, ..., 요일" 형태의 결과
     * */
    public String processNumbers(int[] input) {
        int len = input.length;
        String result = "";

        // for 문을 이용해서 배열 순차 탐색
        for (int i = 0; i < len; i++) {
            // switch 문을 이용해서 각 숫자와 요일 매칭
            switch (input[i]) {
                case 1:
                    result += "Monday";
                    break;
                case 2:
                    result += "Tuesday";
                    break;
                case 3:
                    result += "Wednesday";
                    break;
                case 4:
                    result += "Thursday";
                    break;
                case 5:
                    result += "Friday";
                    break;
                case 6:
                    result += "Saturday";
                    break;
                case 7:
                    result += "Sunday";
                    break;
                default:
                    result += "Unknown";
                    break;
            }

            // 마지막에 경우엔 쉼표를 넣지 않고, 그 외의 경우엔 쉼표로 구별
            if (i != len - 1) {
                result += ", ";
            }
        }

        return result;
    }
}
