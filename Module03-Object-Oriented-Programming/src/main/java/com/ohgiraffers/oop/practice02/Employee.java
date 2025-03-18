package com.ohgiraffers.oop.practice02;

public class Employee extends Person {
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    public void work() {
        System.out.println("직원 " + getName() + "이(가) " + position + "으로 일하고 있습니다.");
    }
}
