package com.practice;

public class EmployeeDetails1 {
    private String name;
    private int age;
    public EmployeeDetails1(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void printEmployeeDetails(){
        System.out.println("Employee Name: " + name );
        System.out.println("Employee Age: " + age );

    }

}
