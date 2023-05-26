package com.JavaBasicsAssn;

public class EmployeeDetails {

    private int id;
    private String name;
    private String address;
    private double salary;

    public EmployeeDetails(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;

    }

    public String toString() {

        return id + " "+ name + "  " + address + "  "+ salary;
    }




}