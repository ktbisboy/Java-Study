package com.ohgiraffers.oop.practice02;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("회사 " + companyName + "의 직원 목록 : ");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + "(" + employee.getPosition() + ", 연봉 : " + employee.getSalary() + "만 원)");
        }
    }
}
