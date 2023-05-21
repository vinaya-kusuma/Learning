package com.JavaBasicsAssn;

import java.util.ArrayList;

public class EvenNumbers {

    private ArrayList <Integer>  A1 ;
    private ArrayList <Integer>  A2 ;
    public EvenNumbers (){

        A1 = new ArrayList<>();
        A2= new ArrayList<>();
    }
public ArrayList<Integer> saveEvenNumbers(int N)  {
        for(int i=0;i<N;i++)
        {
            if (i%2 == 0){
                A1.add(i);

            }

        }

        return A1;

}


public  ArrayList<Integer> printEvenNumbers(){

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


