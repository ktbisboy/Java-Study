package com.ohgiraffers.practice;

public abstract class Car {
    private String brand;
    private String model;
    private double baseFuelEfficiency;

    public Car(String brand, String model, double baseFuelEfficiency) {
        this.brand = brand;
        this.model = model;
        this.baseFuelEfficiency = baseFuelEfficiency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseFuelEfficiency() {
        return baseFuelEfficiency;
    }

    public void setBaseFuelEfficiency(double baseFuelEfficiency) {
        this.baseFuelEfficiency = baseFuelEfficiency;
    }

    public abstract double getMaintenanceCost();
    public abstract double getFuelEfficiency();
}
