package com.JavaBasicsAssn;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;

    public Employee(int id,String name, String address, double salary){
        this.id = id;
        this.name = name;
        this.address= address;
        this.salary = salary;

    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public double getSalary(){
        return salary;

    }

    public static void main(String[] args){

        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee(1,"Armaan","123 street",120000));
        employees.add(new Employee(2,"Ayush","143 street",130000));

        int searchId = 2;
        boolean employeeFound = false;

        for(Employee employee : employees) {
            if (employee.id == searchId){
                employeeFound = true;
                break;

            }

            if (employeeFound)
            {
                System.out.println("Employee found");
            }
            else
            {
                System.out.println("Employee found");
            }

        }
        }

    }

