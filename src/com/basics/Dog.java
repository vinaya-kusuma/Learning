package com.basics;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Implementation for eat method of sub class Dog");
    }

    @Override
    public void sleep() {
        System.out.println("Implementation for sleep method of sub class Dog");
    }
}
