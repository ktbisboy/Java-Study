package com.orgiraffers.c_method.chap01;

public class Application01 {
    public static void main(String[] args) {
        // 메서드가 없는 경우
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
        int num3 = 30;
        int num4 = 40;
        System.out.println(num3 + num4);
        // ...... 위와 같은 행위를 100번 작성해보자.

        Application01 application01 = new Application01();
        int result = application01.add(num1, num2);
        System.out.println(result);
    }

    /*
    * 메서드
    * 메서드는 특정 작업을 수행하는 코드 블록으로, 코드의 재사용성과 가독성을 향상시키기 위해 사용된다.
    * 메서드는 입력값(매개변수)을 받고, 결과값(리턴값)을 반환할 수 있다.
    * 메서드는 프로그램의 구조를 체계적으로 만들고, 유지보수를 용이하게 한다.
    *
    * 형식 :
    * [접근 제어자] [반환 타입] 메서드 명([매개변수 타입 매개변수명]) {
    * 실행할 코드
    * return 반환값;
    * }
    *
    * 접근 제어자란
    * 외부에서 해당 메서드에 접근할 수 있는 범위를 지정한다.
    * - public 모든 클래스에서 접근이 가능하다.
    * - protected : 같은 패키지 또는 자식 클래스에서 접근이 가능하다.
    * - private : 같은 클래스 내에서만 접근이 가능하다.
    * - default : 같은 패키지 내에서만 접근이 가능하다.
    *
    * 반환 타입 : 메서드가 작업을 완료하고 반환할 데이터 타입이다.
    * - void 반환 값이 없을 때 사용된다.
    * - String 문자열을 반환한다.
    * - int char short 등의 기본 자료형도 반환 타입으로 사용된다.
    * - 참조 자료형 : 해당 참조 자료형을 반환한다. <- 클래스 이후에 학습
    *
    * 매개 변수 : 메서드가 호출될 때 외부에서 전달받는 입력값을 정의한다.
    * - 매개변수는 여러 개를 가질 수 있으며 함수 내부에서 사용될 변수를 의미한다.
    * - 이는 일반 변수와 동일하게 타입과 이름을 갖는다.
    * */

    /**
    * 더하기 함수.
    * @return : a + b 값을 반환함.
    * @param a : 좌항 값
    * @param b : 우항 값
    * */
    public int add(int a, int b) {
        return a + b;
    }
}
