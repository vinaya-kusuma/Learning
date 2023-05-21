package com.JavaBasicsAssn;

import java.util.ArrayList;

public class PrintEvenNumbers {
    public static void main(String[] args){
        ArrayList<Integer>  arrayList = new ArrayList<>();
        EvenNumbers evenNumbers = new EvenNumbers();
        arrayList = evenNumbers.saveEvenNumbers(20);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = evenNumbers.printEvenNumbers();
        System.out.println(arrayList1);

        evenNumbers.printEvenNumber(8);
    }
}
