package com.VectorAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo1 {
    public static void main(String[] args){

        //Assignment 1
        Vector<Double> vec = new Vector<Double>(3);
        vec.add(2.0);
        vec.add(3.0);
        vec.add(1.0);
    VectorCalcMag vectorMag = new VectorCalcMag();
    double mag = vectorMag.calcMag(vec);
    System.out.println("The magnitude of the vector "+ vec.get(0)+"i+"+  vec.get(1)+"j+" +  vec.get(2)+"k is "+mag);

    //Assignment 2
        System.out.println("The normalized vector is "+ vec.get(0)/mag + "i +" + vec.get(1)/mag + "j +"+vec.get(2)/mag+"k");

    //Assignment 3

        // vector a = 5i+3j+7k  b=3i-2j-8k
        Vector<Double> myVector1 = new Vector();
        myVector1.add(5.0);
        myVector1.add(3.0);
        myVector1.add(7.0);
        Vector<Double> myVector2 = new Vector();
        myVector2.add(3.0);
        myVector2.add(-2.0);
        myVector2.add(-8.0);
        Vector <Double> result = new Vector<>();
        CalcCrossProd crossProd = new CalcCrossProd();
        result = crossProd.crossProduct(myVector1,myVector2);
        System.out.println("The cross product is" + result.get(0) + "i+"+ result.get(1)+ "j+"+ result.get(2) +"k");


    //Assignment 4

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(1);
        myArrayList.add(8);
        myArrayList.add(13);

        CalcMaxValue calcMax = new CalcMaxValue();

       int  max = calcMax.maxValue((ArrayList<Integer>) myArrayList);
        System.out.println("The maximum value is "+ max);



        //Assignment 5

        List<Integer> myArrayToReverse = new ArrayList<>();
        myArrayToReverse.add(3);
        myArrayToReverse.add(4);
        myArrayToReverse.add(1);
        myArrayToReverse.add(8);
        myArrayToReverse.add(13);

      ReverseArrayList revArray = new ReverseArrayList();

        ArrayList  reversedArray = (ArrayList) revArray.reverseList((ArrayList<Integer>) myArrayToReverse);
        System.out.println("The reversed ArrayList of "+ myArrayToReverse +" is "  + reversedArray);

        }

    }

