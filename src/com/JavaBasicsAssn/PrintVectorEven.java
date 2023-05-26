package com.JavaBasicsAssn;

import java.util.Vector;

public class PrintVectorEven {

    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        VectorEvenNumbers evenNumbers = new VectorEvenNumbers();
        vector = evenNumbers.saveEvenNumbers(20);
        System.out.println(vector);

        Vector<Integer> vector1 = evenNumbers.printEvenNumbers();
        System.out.println(vector1);

        evenNumbers.printEvenNumber(8);
    }
}

