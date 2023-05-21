package com.assignment;

public class Truck extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck type : Make: " + make +"and model: " + model);
    }
}
