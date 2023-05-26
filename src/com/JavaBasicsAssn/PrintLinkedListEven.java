package com.JavaBasicsAssn;

import java.util.LinkedList;

public class PrintLinkedListEven {

    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedListEvenNumbers evenNumbers = new LinkedListEvenNumbers();
        linkedList = evenNumbers.saveEvenNumbers(20);
        System.out.println(linkedList);

        LinkedList<Integer> arrayList1 = evenNumbers.printEvenNumbers();
        System.out.println(arrayList1);

        evenNumbers.printEvenNumber(8);
    }
}

