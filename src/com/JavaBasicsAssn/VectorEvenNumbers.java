package com.JavaBasicsAssn;

import java.util.Vector;

public class VectorEvenNumbers {


    private Vector<Integer> A1 ;
    private Vector <Integer>  A2 ;
    public VectorEvenNumbers (){

        A1 = new Vector<>();
        A2= new Vector<>();
    }
    public Vector<Integer> saveEvenNumbers(int N)  {
        for(int i=0;i<N;i++)
        {
            if (i%2 == 0){
                A1.add(i);

            }

        }

        return A1;

    }


    public  Vector<Integer> printEvenNumbers(){

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


