## 쉼표로 구분된 3개의 숫자 문자열의 합계와 평균 구하기
### <요구사항 명세화>

- 미션 1: SimpleCalculator
- 입력: 쉼표로 구분된 3개의 숫자 문자열 (예: "10, 20, 30")

> 처리:
1. 입력 문자열에서 공백을 제거한다.
2. 쉼표(,)를 기준으로 문자열 배열을 생성한다.
3. 배열의 인덱스 0, 1, 2의 값을 변수에 직접 할당하고 정수로 변환한다.
4. 세 숫자의 합계를 계산하고, 평균을 구한다 (정수 나눗셈).
5. 출력: "합계: X, 평균: Y" 형태의 결과 문자열.
6. 제약: 반복문 없이, 변수, 데이터 타입, 연산자, 배열과 문자열 다루기 기술만 사용한다.

- <개발 순서>
1. 입력 문자열의 공백 제거.
2. split() 메서드를 사용하여 쉼표로 분할한 배열을 생성.
3. 배열 인덱스 0, 1, 2의 요소를 각각 변수에 할당 후 정수형으로 변환.
4. 변수들을 이용해 합계와 평균을 계산.
5. 결과 문자열을 생성하여 반환.