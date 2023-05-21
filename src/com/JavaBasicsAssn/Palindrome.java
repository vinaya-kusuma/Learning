package com.JavaBasicsAssn;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int storeNum = num;
        int revnum = 0;
        while (num != 0) {

            revnum = revnum * 10;
            revnum += num % 10;
            num = num / 10;
        }

        if (storeNum == revnum){

            System.out.println("The given number is a palindrome");

        }
        else {
            System.out.println("The given number is not a palindrome");
        }
        }
    }
