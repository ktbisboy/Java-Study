package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {
        Car[] cars = {
                new GasolineCar("Toyota", "Camry", 15, 1.8),
                new ElectricCar("Tesla", "Model 3", 20, 0.9),
                new GasolineCar("Hyundai", "Sonata", 14, 1.6),
                new ElectricCar("Nissan", "Leaf", 18, 1.2)
        };

        CarInventoryCalculator calculator = new CarInventoryCalculator(cars);
        String result = calculator.CalculateResult();
        System.out.println(result);
    }
}
