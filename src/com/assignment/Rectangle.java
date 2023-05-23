package com.assignment;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }
    @Override
    public double getArea() {
        return (length*width);
    }
}
