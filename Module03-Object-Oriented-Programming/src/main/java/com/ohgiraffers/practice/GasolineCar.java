package com.ohgiraffers.practice;

public class GasolineCar extends Car {
    private double fuelCostPerLiter;

    public GasolineCar(String brand, String model, double baseFuelEfficiency, double fuelCostPerLiter) {
        super(brand, model, baseFuelEfficiency);
        this.fuelCostPerLiter = fuelCostPerLiter;
    }

    @Override
    public double getMaintenanceCost() {
        return fuelCostPerLiter * 10;
    }

    @Override
    public double getFuelEfficiency() {
        return getBaseFuelEfficiency() - 2;
    }
}
