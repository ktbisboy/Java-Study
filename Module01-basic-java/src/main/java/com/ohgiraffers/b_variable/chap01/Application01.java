package com.ohgiraffers.b_variable.chap01;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 변수
        * 변수는 데이터를 저장하기 위해 메모리 공간을 참조하는 이름이다.
        * 즉, 프로그램이 데이터를 다룰 때 메모리 어딘가에 값을 저장하고,
        * 그 위치를 이름으로 쉽게 불러오는 역할을 한다.
        * 예를 들어 'int number = 10'이라는 코드가 존재한다면
        * 여기서 변수명은 'number'가 되는 것이다.
        * number는 메모리의 주소와 매칭되어 0x001을 사람이 이해하기 쉽게 'number'라고 표현하는 것이다.
        * */

        /* 이해하기 */
        // 아래와 같은 주소값이 1백개 있다고 가정해보자.
        // int 0x001 = 10;
        // int 0x002 = 20;

        int number1 = 10;
        int number2 = 20;

        System.out.println(" number1: " + number1);
        System.out.println(" number2: " + number2);

        /* 변수의 활용 */
        number1 = 30;
        System.out.println(" number1: " + number1);

        /*
        * 변수의 활용2
        * 변수를 사용하면 같은 데이터를 여러 번 활용할 수 잇다.
        * 또한 가독성이 좋아지고 유지보수가 편리해진다.
        * */
        int width = 10;
        int height = 20;
        int area = width * height;
        System.out.println(" area: " + area);

        /*
        * 데이터 타입
        * 변수를 사용하기 위해서는 데이터 타입이라는 것이 필요하다.
        * 이러한 데이터 타입은 변수에 저장할 데이터의 종류와 크기에 맞는 메모리 공간을 찾고,
        * 그 곳에 값을 정의하기 위해 사용된다.
        * 이는 변수에 저장할 데이터의 특성을 명확히 규정함으로써 프로그램이 데이터를 올바르게 처리할 수 있도록 보장한다.
        * 예를 들어, 숫자 데이터를 저장하려면 int나 double과 같은 타입을 지정하고, 문자열을 저장하려면 String을 사용한다.
        *
        * 일상에서 생각해보자.
        * 만약 라면을 담으려는데 밥 그릇만 있다면 라면이 넘치거나 제대로 담기지 않을 것이다.
        * 반대로 세수대야처럼 너무 큰 그릇을 사용하면 불필요하게 공간이 낭비된다.
        * 이렇듯 데이터 타입은 너무 크거나 작지 않고, 상황에 따라 적절한 크기를 선택해야 하는 중요한 역할을 한다.
        *
        * 데이터 타입이 필요한 이유는 이뿐만이 아니다.
        * 데이터 타입은 프로그램이 라면을 끓이기 전에 그릇의 크기를 미리 확인하는 것처럼,
        * 데이터 처리 과정에서 발생할 수 있는 문제를 사전에 방지한다.
        * 예를 들어 'int' 타입 변수에 문자열을 넣으려고 한다면 컴파일 오류가 발생되어 사용자의 잘못을 막아준다.
        * 또한 데이터 타입은 연산 기능 여부를 결정한다.
        * 예를 들어 int는 덧셈이 가능하짐나 boolean은 논리 연산만이 허용된다.
        * 이는 코드의 안정성과 가독성 및 유지보수를 높여주는 핵심 요소이다.
        * */

        // 정수형
        byte bNum = 10;
        short sNum = 20;
        int iNum = 20;
        long lNum = 20;

        // 실수형
        float fNum = 20;
        double dNum = 20;

        // 논리형
        boolean bool = true;

        // 문자형
        char char1 = 'a';
        String str1 = "Hello World";
    }
}
