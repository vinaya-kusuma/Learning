package com.assignment;

public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Car type : Make: " + make +"and model: " + model);
    }
}
