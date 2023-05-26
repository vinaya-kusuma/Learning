package com.JavaBasicsAssn;

import java.util.LinkedList;

public class LinkedListEvenNumbers {

    private LinkedList<Integer> A1 ;
    private LinkedList <Integer>  A2 ;
    public LinkedListEvenNumbers (){

        A1 = new LinkedList<>();
        A2= new LinkedList<>();
    }
    public LinkedList<Integer> saveEvenNumbers(int N)  {
        for(int i=0;i<N;i++)
        {
            if (i%2 == 0){
                A1.add(i);

            }

        }

        return A1;

    }


    public  LinkedList<Integer> printEvenNumbers(){

        for(int i=0;i<A1.size();i++){
            A2.add(A1.get(i));
            System.out.println(A2.get(i));

        }
        return A2;
    }

    public void printEvenNumber(int N){
        if (A1.contains(N)){
            System.out.println("Exists");

        }
        else{
            System.out.println("Does not Exists");
        }

    }


}


