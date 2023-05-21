package com.Assignment2;

public class Circle implements Shape{

    //variable to hold the radius
    private double radius;
    public Circle(double rad){
        this.radius=rad;

    }
    //implementation of calculateArea method
    @Override
    public double calculateArea() {
        return (3.14*radius*radius);
    }
}
