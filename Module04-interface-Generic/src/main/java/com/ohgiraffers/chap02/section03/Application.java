package com.ohgiraffers.chap02.section03;

/*
* 와일드카드란?
* - 제네릭스에서 :어떤 타입:을 유연하게 다루는 방법이다.
* - 문법
*   <? extends 타입 > : 그 타입과 그 아래만 허용 (꺼내기 쉬움)
*   <? super 타입 > : 그 타입과 그 위만 허용 (넣기 쉬움)
*
* 설계 과정
* 1) 기본 상자 (초급)
* - FoxxBox<Apple>은 사과만 담음 -> 다른 과일 다루려면 유연성 부족
* 2) extends로 꺼내기
* - <? extends Fruit> :과일과 그 하위 (사과, 포도) 꺼내기 가능.
* 3) super로 넣기
* - <? super Apple> : 사과를 과일 상자에 넣기 가능.
* */

public class Application {
    public static void main(String[] args) {
        System.out.println("기본 상자");
        FoodBox<Apple> appleBox = new FoodBox<>();
        appleBox.setItem(new Apple("Apple"));
        System.out.println("꺼낸 물건 : " + appleBox.getItem());

        System.out.println("와일드 카드 넣기");
        FoodBox<Fruit> fruitBox = new FoodBox<>();
        putApple(fruitBox, new Apple("Apple"));

        FoodBox<Grape> grapeBox = new FoodBox<>();
        // putApple(grapeBox, new Apple("12"));
    }

    private static void showFruit(FoodBox<? extends Fruit> box) {
        Fruit fruit = box.getItem();
        System.out.println("꺼낸 과일 " + fruit);

        // box.setItem(new Apple("hello"));
        /*
        * box는 FoodBox<? extends Fruit>로 정의되어 있어,
        * 어떤 특정 서브 타입(FoodBox<Apple>, FoodBox<Banana> 등)인지 컴파일러가 알 수 없다.
        * showFruit를 호출하는것을 보면, "포도 박스", "사과 박스"가 매개변수로 전달된다.
        *
        * 따라서 box에 Apple을 넣는 것은 타입의 불일치를 초래할 수 있기 때문에
        * 컴파일러는 이를 안전하지 않다고 판다하여 오류를 발생시키는 것이다.
        * 꺼내는 것은 안전하지만(모든 서브 타입을 Fruit로 처리 가능), 넣는 것은 허용하지 않는다.
        * */
    }

    private static void putApple(FoodBox<? super Apple> box, Apple apple) {
       box.setItem(apple);

       // Apple fruit = box.getItem();
        /*
        * 꺼낼 수 없는 이유
        * box는 FoodBox<? extends Fruit>로 정의되어 있어, Apple의 상위 타입을 허용한다.
        * - 따라서 Box에 들어 있는 객체는 Apple이 아닐 수도 있다.
        * - 예를 들어, Fruit 또는 Object 타입이 들어갈 수 있다는 것이다.
        * - Get() 메서드 호출 시 반환되는 타입이 보장되지 않기 때문에
        * - 이를 Apple로 직접 캐스팅하는 것은 안전하지 않다.
        * - 타입 안정성을 보장하기 위해 컴파일러는 오류를 발생시킨다.
        *
        * 즉, box에 타입 제한이 Apple의 상위 타입이기 때문에 Apple만 들어있다는 보장이 불가능하다.
        * */
    }
}

/*
* PECS 원칙 (Producer Extends, Consumer Super)
* - 꺼내는 경우(Producer) extends, 넣은 경우(Consumer) super를 뜻한다.
* - PECS의 이해 :
* - <? extends T> (Producer) :
*   - T와 그 하위 타입에서 "꺼내기"만 가능 -> 읽기 안정성 보장
*   - 예 : <? extends Fruit>는 fruit 상자에서 사과나 포도 꺼내기 OK, 넣기는 불가
* - <? super T> (Consumer) :
 *   - T와 그 상위 타입에서 "넣기"만 가능 -> 읽기 안정성 보장
 *   - 예 : <? super Apple>는 Apple을 fruit 상자에 넣기 OK, 꺼내기는 불가
* */
