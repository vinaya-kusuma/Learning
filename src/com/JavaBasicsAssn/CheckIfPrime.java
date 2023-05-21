package com.JavaBasicsAssn;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int rem=0;
        int i=0;
        if (num >1){
            for ( i=2;i<num/2;i++) {
                rem = num % i;
                if (rem == 0)
                    break;

            }
            if (rem !=0)
            {System.out.println("prime");}
            else {System.out.println("not prime");}
        }


        else{
            System.out.println("number must be greater than 1");
        }

    }
}
