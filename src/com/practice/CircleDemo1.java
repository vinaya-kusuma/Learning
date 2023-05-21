package com.practice;

public class CircleDemo1 {
    public static void main(String[] args){
        Circle c=new Circle();
        c.x=0.0;
        c.y=0.0;
        c.r=2.0;

        System.out.println("the area of the circle is " + ": " + c.area());
        System.out.println("the circumference of the circle is " + ": " + c.circumference());

        DivideZero d1 = new DivideZero();
        int result = d1.dividend(20,0);
        System.out.println(result);

    }
}
