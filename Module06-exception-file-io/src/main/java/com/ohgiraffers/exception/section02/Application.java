package com.ohgiraffers.exception.section02;

/*
* 예외 처리(try-catch-finally, 사용자 정의 예외)
* - 예외(exception)은 프로그램 실행 중 예상치 못한 문제로 인해 정상적인 프롬이 중단되는 상황을 만한다.
* - 예를 들어, 사용자가 0으로 나누기를 시도하거나, 파일을 열 때 파일이 존재하지 않는 경우 등이 있다.
* - java에서는 try-catch 블록을 통해 이러한 예외를 처리하며, finally 블록으로 필수 정리 작업을 보장한다.
* - 사용자 정의 예외는 특정 상황에서 개발자가 직접 예외를 만들어 사용하는 것으로 코드의 의도를 명확히 전달해야 한다.
*
* 예외 처리가 필요한 이유
* - 예외가 발생하면 프로그램이 비정상적으로 종료되어야 한다.
* - 안정적인 프로그램 실행을 위해 반드시 처리해야 한다.
*
* try-cathc 문법
* - try : 예외가 발생할 가능성이 있는 코드 블록
* - catch : 특정 예외를 처리하는 코드 블록
* - finally : 예외 발생 여부와 상관없이 항상 실행되는 코드 블록(자원 해제에 사용)
* */

public class Application {
    public static void main(String[] args) {
        try {
            int number = 10;
            int result = number / 0;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("아놔 오류 났네~~~");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("이것은 항상 동작합니다.");
        }
        System.out.println("그래도 프로그램은 동작하지");
    }
}
