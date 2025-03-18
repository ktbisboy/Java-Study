package com.ohgiraffers.d_arrays;

/*
* 배열은 힙 메모리에 연속적으로 할당되며, 참조 스택에 저장된다.
* - 예 : int[] arr = new int[3]; -> 힙에 12바이트 할당
* 배열의 연속성 덕분에 인덱스 접근 O(1)로 빠르지만, 고정으로 동적 확장이 불가능하다.
* */

public class ArrayDeep {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println("배열의 현재 주소 : " + arr);

        /*
        * 배열 복사 (깊은 복사)
        * 깊은 복사는 원본 배열의 요소를 새로운 배열에 복사하며,
        * 두 배열이 서로 독립적으로 존재하도록 만든다.
        * 원본 배열의 데이터는 변경되지 않으며, 깊은 복사된 배열에 대한 변경은
        * 원본 배열에 영향을 미치지 않는다.
        * */

        int[] deepCopy = java.util.Arrays.copyOf(arr, arr.length);
        System.out.println("복사된 배열의 주소 : " + deepCopy);
        System.out.println("원본 배열의 값 : " + java.util.Arrays.toString(arr));
        System.out.println("깊은 복사 배열의 값 : " + java.util.Arrays.toString(deepCopy));

        System.out.println(deepCopy[0]);
        deepCopy[0] = 1000;
        System.out.println(deepCopy[0]);
        System.out.println(arr[0]);

        /*
        * 배열 복사 (얕은 복사)
        * 얕은 복사는 원본 배열의 참조를 새로운 변수에 할당한다.
        * 이 경우, 두 변수는 같은 배열을 가리키며,
        * 한 배열에서 데이터를 변경하면 다른 배열에도 영향을 주게 된다.
        * */
        int[] shallowCopy = arr;
        System.out.println("원본 배열의 주소 : " + arr);
        System.out.println("얕은 복사 배열의 주소 : " + shallowCopy);
        System.out.println("얕은 복사 배열의 0번째 : " + shallowCopy[0]);
        shallowCopy[0] = 1000;
        System.out.println("원본 배열의 0번째 : " + arr[0]);
    }
}
