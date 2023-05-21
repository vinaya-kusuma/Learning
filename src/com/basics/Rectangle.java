package com.basics;

public class Rectangle extends Shape{
 public double length;
 public double width;
    @Override
    public double getArea() {
        return (length * width);

    }
}
