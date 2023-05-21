package com.Assignment2b;
import java.util.Date;
public class Employee {
    private String name;
    private double salary;
    private Date hireDate;
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("Salary must be > 0");
        }
        else {
            this.salary = salary;
        }
    }


}
