package com.basics;

public class Employee extends Person{
    public float salary;
    public void getSalary(){
        System.out.println("The salary of " + firstName+ " " +lastName + " is " + salary);
    }

}
