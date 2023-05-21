package com.JavaBasicsAssn;

import java.util.Scanner;

public class PosOrNeg {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num>0){
            System.out.println("Number is positive");
        }
        else if (num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }

    }
}
