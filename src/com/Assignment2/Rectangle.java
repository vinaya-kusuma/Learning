package com.Assignment2;

public class Rectangle implements Shape{

    //variables to hold length and width
    private double length;
    private double width;
    Rectangle(double len, double wid){
        this.length = len;
        this.width = wid;
    }

    //implementation of calculateArea method
    @Override
    public double calculateArea() {
        return (length*width);
    }

}
