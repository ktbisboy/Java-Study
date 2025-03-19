package com.ohgiraffers.section01;

import java.util.ArrayList;
import java.util.List;

public class ListDeep {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(2); // 초기 용량 2
        intList.add(1);
        System.out.println("초기 number의 주소 : " + intList.hashCode());

        intList.add(2);
        System.out.println("초기 number의 주소 : " + intList.hashCode());

        intList.add(3); // 용량 초과 -> 배열 확장
        System.out.println("확장된 number의 주소 : " + intList.hashCode());

        long startTime = System.nanoTime();
        List<String> unoptimizedList = new ArrayList<>();
        for (int i=0; i<10000; i++) {
            unoptimizedList.add("책"+i);
        }
        long endTime = System.nanoTime();
        long unoptimizedDuration = endTime - startTime; // 총 동작 시간

        startTime = System.nanoTime();
        List<String> optimizedList = new ArrayList<>(10000);
        for (int i=0; i<10000; i++) {
            unoptimizedList.add("책"+i);
        }
        endTime = System.nanoTime();
        long optimizedDuration = endTime - startTime;

        System.out.println("비 최적화 리스트 요소 시간 : " + unoptimizedDuration);
        System.out.println("최적화 리스트 소요 시간 : " + optimizedDuration);
    }
}
