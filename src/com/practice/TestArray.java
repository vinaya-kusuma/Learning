package com.practice;

public class TestArray {
    public static void main(String[] args){
        int[]  a = {1,2,3,4,5};
        int sum=0;
        double avg =0;
        for (int i=0;i<a.length;i++){
            sum+= a[i];



        }
        avg = sum/a.length;
        System.out.println(avg);


    }
}
