package com.ohgiraffers.oop.chap01.basic2;

public class MovieTicket {
    public String movieName;
    public String seatNumber;

    // 생성자의 규칙
    // 접근제어자 클래스명 (매개변수) {범위}
    public MovieTicket(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
    }
    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }
    public MovieTicket() {}

    public void printTicket() {
        System.out.print("영화 제목 : " + movieName);
        System.out.print("좌석 번호 : " + seatNumber);
        System.out.println("으로 티켓이 발급되었습니다.");
    }
}
