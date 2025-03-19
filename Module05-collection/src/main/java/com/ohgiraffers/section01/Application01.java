package com.ohgiraffers.section01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* ArrayList 기초
* - ArrayList는 순서가 있는 동적 리스트로, 데이터를 순차적으로 저장하며 중복을 허용한다.
* - 배열과 달리 크기가 고정되지 않아 필요에 따라 확장된다.
* - 왜 사용? 배열은 크기 고정으로 유연성이 떨어지지만, ArrayList는 동적 관리 가능.
*
* ArrayList의 주요 특징
* 1. 동적 크기 조정 :
* - ArrayList는 내부적으로 배열을 사용하지만, 크기가 고정되지 않아서 데이터가 추가될 때 자동으로 크기를 조정한다.
* - 크기가 부족할 경우, 새로운 배열을 생성하여 기존 데이터를 복사하고 새로울 데이터를 추가하는 방식으로 작동된다.
*
* 2. 중복 허용 :
* - ArrayList는 같은 값을 여러 번 저장할 수 있다. 이는 데이터의 중복이 필요한 경우 유용하다.
*
* 3. 순서 유지 :
* - 요소의 순서가 유지되므로 인덱스를 통해 특정 요소에 접근할 수 있다.
*
* 4. 데이터 타입 :
* - ArrayList는 제네릭을 사용하여 다양한 데이터 타입을 저장할 수 있다.
* - 예를 들어, <String>, <Integer>

* 5. 성능
* - 요소 추가 시, 리스트의 끝에 추가하는 경우 O(1)의 시간 복잡도를 가진다.
* - 그러나 중간에 요소를 삽입하거나 삭제할 경우 O(n)의 시간 복잡도를 가지므로 주의가 필요하다.
* - 0:a, 1:b, 2:c, 3:d의 경우 "1번 인덱스를 제거하면, 0:a, 1:c, 2:d가 되어야 한다.
* - 즉, 모든 요소만큼 인덱스가 변경되어야 하기 때문에 시간복잡도가 요소의 갯수만큼 증가한다.
*
* 6. 메모리 사용
* - ArrayList는 내부 배열을 사용하기 때문에 데이터의 수가 많아질 경우 메모리 사용량이 증가할 수 있다.
* - 메모리 부족 상황에서 자동으로 배열을 재할당하므로 성능 저하가 발생할 수 있다.
* */

public class Application01 {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<String>();
        bookList.add("자바의 정석");
        bookList.add("클린코드");
        bookList.add("자바의 정석");

        // 중복 값을 허용한다.
        System.out.println(bookList);

        /*
        * - add()는 리스트 끝에 요소 추가, 기본 O(1) 시간 복잡도.
        * - 메모리 : bookList는 스택에 잠조, 데이터는 힙의 동적 배열에 저장
        * */

        // 요소 접근
        String firstBook = bookList.get(0);
        System.out.println("첫 번째 책 : " + firstBook);
        // 요소의 인덱스를 참조하여 데이터를 꺼내올 수 있다.

        // 요소 삭제
        bookList.remove(0);
        System.out.println("수정된 list : " + bookList); // 0번째 책이 삭제된 것을 볼 수 있다.

        // 요소 수정
        bookList.set(0, "Effective Java"); // 원래의 0번째 값은 클린코드였다.
        System.out.println(bookList); // Effective Java로 변경된 것을 볼 수 있음.

        // list의 길이를 확인
        System.out.println("현재 list의 길이는 : " + bookList.size());

        // list 초기화
        bookList.clear();
        System.out.println(bookList);

        bookList.add("c");
        bookList.add("a");
        bookList.add("b");

        System.out.println("정렬 이전 : " + bookList);
        System.out.println("list 정렬하기");
        Collections.sort(bookList);
        System.out.println("정렬 이후 : " + bookList);

        // 제네릭으로 인해 타입이 고정되어 다음과 같이 for 문을 사용할 수 있다.
        for (String book : bookList) {
            System.out.println(book);
        }
    }
}
