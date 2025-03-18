요구사항 명세화
미션 1: 자동차 유지비 및 연비 계산 기능 구현 (객체지향 적용)

입력: Car 객체 배열 (각 Car 객체는 기본 정보를 포함하며, 자동차 종류에 따라 유지비 및 연비 계산 방식이 다름)

처리:

추상 클래스 Car 를 정의하여 private 멤버 변수 brand, model, baseFuelEfficiency (기본 연비)를 선언하고, 생성자와 getter, 그리고 추상 메서드 getMaintenanceCost()와 getFuelEfficiency() 를 제공한다.
GasolineCar 클래스 는 Car 를 상속받아 fuelCostPerLiter 멤버 변수를 추가하고,
getMaintenanceCost() 를 오버라이딩하여 (fuelCostPerLiter * 10)을 반환
getFuelEfficiency() 를 오버라이딩하여 baseFuelEfficiency - 2 를 반환
ElectricCar 클래스 는 Car 를 상속받아 batteryEfficiency 멤버 변수를 추가하고,
getMaintenanceCost() 를 오버라이딩하여 (batteryEfficiency * 5) 를 반환
getFuelEfficiency() 를 오버라이딩하여 baseFuelEfficiency + 5 를 반환
CarInventoryCalculator 클래스 를 작성하여 Car 배열을 받아 다형성을 활용해 각 자동차의 유지비 및 연비를 계산하고,
총 유지비, 평균 연비, 최고 연비 차량 및 최저 연비 차량 을 계산한다.
"총 유지비: X, 평균 연비: Y, 최고 연비 차량: [Brand Model], 최저 연비 차량: [Brand Model]" 형태의 결과 문자열을 반환한다.
포함 기술: 클래스 및 객체, 생성자, 캡슐화, 상속, 다형성, 배열, 문자열 다루기

JUnit 활용: @BeforeEach, @AfterEach, @Test, assertEquals, assertTrue

개발 순서
추상 클래스 Car 를 정의하여 private 멤버 변수, 생성자, getter 및 추상 메서드를 구현
GasolineCar 클래스 를 정의하여 Car 를 상속하고 fuelCostPerLiter 를 추가하며 getMaintenanceCost() 와 getFuelEfficiency() 를 오버라이딩
ElectricCar 클래스 를 정의하여 Car 를 상속하고 batteryEfficiency 를 추가하며 getMaintenanceCost() 와 getFuelEfficiency() 를 오버라이딩
CarInventoryCalculator 클래스 를 정의하여 Car 배열을 처리하고, for 문을 통해 총 유지비, 평균 연비, 최고/최저 연비 차량 을 계산하는 메서드를 구현
결과 문자열을 생성하여 반환