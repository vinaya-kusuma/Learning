package com.Assignment2b;

public class Circle extends Shape{
    private double radius;

    public Circle(double rad){
        this.radius=rad;
    }
    @Override
    public double calculateArea() {
        return (3.14*radius*radius);
    }
}
