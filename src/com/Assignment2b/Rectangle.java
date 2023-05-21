package com.Assignment2b;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double len,double wid){
        this.length=len;
        this.width=wid;

    }
    @Override
    public double calculateArea() {
        return (length*width);
    }
}
