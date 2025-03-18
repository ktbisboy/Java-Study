package com.orgiraffers.b_loop.chap02;

/*
* while 문
* while 문은 조건식이 true인 동안 코드를 반복 실행한다.
* 형식 : while(조건식){실행 코드}
* 반복 횟수가 불확실하거나 조건에 따라 종료해야 할 때 유용하다.
* */

public class Application01 {
    public static void main(String[] args) {
        int count = 0;

        jump:
        while (count < 5) {
            System.out.println("카운트 : " + count);
            count++;

            while (true) {
                break jump;
            }
        }
    }
}