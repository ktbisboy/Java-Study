package com.ohgiraffers.chap01.section02;

/*
* 인터페이스란
* - 특점 관점(기능)을 독립적으로 정의한 규칙이다.
* - 'interface'로 선언, 구현은 클래스에서.
*
* 인터페이스로 상속 문제 해결
* - Animal은 기본 동물 정의, 울음소리는 soundMaker로 분리
* - 강아지, 고양이는 SoundMaker 구현, 뱀은 안함.
* - 결과 : 울음소리 없는 뱀은 불필요한 기능을 안 물려받게 된다.
* */

public class Application {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Snake()};

        /*
        * 캐스팅 이해
        * 업 캐스팅 :
        *   자식 클래스의 객체를 부모 클래스로 변환하는 과정
        *   자식의 기능을 접근할 수 없으나 부모에게 물려받은 기능은 접근 가능
        *   dog -> animal
        * 다운 캐스팅 :
        *   부모 클래스 타입의 객체를 자식 클래스 타입으로 변환하는 과정
        *   이 경우, 해당 객체가 실제로 자식 클래스의 인스턴스일 때만 가능
        *   Animal animal = new Dog();
        *   (Dog) animal;
        * */

        System.out.println("동물들 중 울 수 있는 녀석은 울어~~~");
        for (Animal animal : animals) {
            if (animal instanceof SoundMaker) {
                ((SoundMaker) animal).makeSound();
            }
            else {
                System.out.println("울음소리가 없는 동물이네요.");
            }
        }
    }
}