package com.assignment;



public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Implementation of eat method for sub class cat");
    }

    @Override
    public void sleep() {
        System.out.println("Implementation of sleep method for sub class cat");
    }
}
