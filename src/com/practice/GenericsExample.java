package com.practice;

public class GenericsExample {
    public static void main(String[] args){

        Printer<Integer> intprinter = new Printer<>(12);
        intprinter.print();

        Printer<Double> doubleprinter = new Printer<>(12.3);
        doubleprinter.print();

    }
}
