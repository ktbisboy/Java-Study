package com.ohgiraffers.oop.chap01.basic2;

public class Application {
    public static void main(String[] args) {
        TicketWithoutConstructor ticket = new TicketWithoutConstructor();
        ticket.movieName = "어벤져스"; // <-- 개발자가 생략할 수 있다.
        ticket.seatNumber = "A10";
        ticket.printTicket();

        /*
        * 문제점 :
        * 객체를 생성한 후, 모든 필드를 수동으로 설정해야 한다.
        * 이러한 과정에서 누락될 위험이 있으며 필드를 설정하지 않는 경우
        * 초기값이 없는 상태로 사용될 위험이 있다.
        * */

        // 인스턴스 만들기
        MovieTicket ticket1 = new MovieTicket("어벤져스", "A10");
        ticket1.printTicket();
    }
}
