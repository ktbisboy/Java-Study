package com.ohgiraffers.practice;

public class CarInventoryCalculator {
    private Car[] cars;

    public CarInventoryCalculator(Car[] cars) {
        this.cars = cars;
    }

    public String CalculateResult() {
        double sum1 = 0;
        double sum2 = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        Car minM = cars[0];
        Car maxM = cars[0];

        for (Car car : cars) {
            if (car.getFuelEfficiency() < min) {
                min = car.getFuelEfficiency();
                minM = car;
            }
            if (car.getFuelEfficiency() > max) {
                max = car.getFuelEfficiency();
                maxM = car;
            }
            sum1 += car.getFuelEfficiency();
            sum2 += car.getFuelEfficiency();
        }
        double avg = sum2 / cars.length;

        return "총 유지비: " + sum1 + ", 평균 연비: " + avg + ", 최고 연비 차량: " + maxM.getBrand() + " " + maxM.getModel()
                + ", 최저 연비 차량: " + minM.getBrand() + " " + minM.getModel();
    }
}
