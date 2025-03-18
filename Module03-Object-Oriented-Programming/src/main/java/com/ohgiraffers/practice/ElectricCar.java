package com.ohgiraffers.practice;

public class ElectricCar extends Car {
    private double batteryEfficiency;

    public ElectricCar(String brand, String model, double baseFuelEfficiency, double batteryEfficiency) {
        super(brand, model, baseFuelEfficiency);
        this.batteryEfficiency = batteryEfficiency;
    }

    @Override
    public double getMaintenanceCost() {
        return batteryEfficiency * 5;
    }

    @Override
    public double getFuelEfficiency() {
        return getBaseFuelEfficiency() + 5;
    }
}
