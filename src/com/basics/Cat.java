package com.basics;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("This is the implementation of eat method for cat");
    }

    @Override
    public void sleep() {
        System.out.println("This is the implementation of sleep method for cat");
    }
}
