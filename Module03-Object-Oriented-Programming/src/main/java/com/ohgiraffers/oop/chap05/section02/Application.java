package com.ohgiraffers.oop.chap05.section02;

/*
* 다형성이란?
* - 부모 클래스 타입으로 여러 자식 객체를 다룰 수 있는 것을 의미한다.
*   즉, 부모(클래스, 인터페이스)를 상속 받은 모든 자식 클래스는 부모 타입이 될 수 있다는 것이다.
* - 상속과 메서드 오버라이딩을 통해 구현된다.
* - 비유 : 동물원에서 "동물들아, 소리 내라!"라고 한 번 명령하면 강아지는 "멍멍", 고양이는 "야옹"으로 각자 반응하게 된다.
* 
* 다형성을 사용하지 않으면 생기는 문제
* 1) 코드 중복 :
*   - 각 동물 타입마다 별도 변수와 메서드 호출을 작성해야 한다.
*   - 예 : Dog dog = new Dog(); Cat cat = new Cat(); 처럼 각각 선언하고 호출하면 코드가 길어지게 된다.
* 
* 2) 유지보수 어려움
*   - 새 동물(예 : bird)이 추가될 때마다 새로운 변수와 호출 코드를 추가해야 한다.
*   - 예 : Bird bird = new Bird(); bird.makeSound()를 또 작성해야됨.
* 
* 3) 유연성 부족
*   - 동물들을 한꺼번에 묶어서 다룰 방법이 없다.
*   - 예 : 모든 동물 소리 내라와 같은 통합 명령이 불가능하다.
*   - 결과 : 프로그램이 확장되면 점점 더 복잡하고 제약이 많아진다.
* 
* 다형성으로 해결하는 방법
* - 부모 타입(Animal)을 사용해 모든 자식 객체를 통합 관리
* - 동작 과정 :
*   1) Animal 타입 배열에 Dog, Cat 등 자식 객체를 넣음
*   2) 오버라이딩된 makeSound()가 각 객체에 맞게 실행됨.
*   - 장점 :
*   1) 중복 제거 : 한 번의 반복문으로 모든 동물 호출
*   2) 유지보수 쉬움 : 새 동물 추가 시 배열에 넣기만 하면 끝
*   3) 유연성 : 부모 타입으로 다양한 동작 처리 가능
* */

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 조금 더 이해하기
        // 스토리 : 동물원에 동물만 입장해야 하는 경우
        Dog dog = new Dog();
        Cat cat = new Cat();
        FakeAnimal fakeAnimal = new FakeAnimal();

        List aniamlList = List.of(dog, cat, fakeAnimal);
        int index = aniamlList.size();
        for (int i = 0; i < index; i++) {
            if(aniamlList.get(i) instanceof Dog) {
                System.out.println(aniamlList.get(i) + "은 동물원에 입장이 가능합니다.");
            } else {
                System.out.println(aniamlList.get(i) + "은 동물원에 입장이 불가능합니다.");
            }
        }
    }
}
