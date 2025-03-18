package com.ohgiraffers.oop.practice02;

public class Application {
    public static void main(String[] args) {
        Employee employee1 = new Employee("김철수", 30, "개발자", 5000);
        Employee employee2 = new Employee("이영희", 30, "디자이너", 4500);

        employee1.introduce();
        employee1.work();
        System.out.println();

        Company company = new Company("CodeWave");
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.listEmployees();
    }
}
