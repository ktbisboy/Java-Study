package com.ohgiraffers.chap01.section03.model;

public abstract class Device {
    private String model;

    public Device(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void powerOn();
    public abstract void powerOff();
}
