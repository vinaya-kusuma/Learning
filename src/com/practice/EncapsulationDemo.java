package com.practice;

public class EncapsulationDemo {
    public static void main(String[] args){

        EmployeeDetails employee = new EmployeeDetails();
        employee.setAge(28);
        employee.setName("Harry Lim");

        System.out.println(employee.getName());
        System.out.println(employee.getAge());


    }
}
