package com.JavaBasicsAssn;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int revnum = 0;
        while (num != 0) {

            revnum = revnum * 10;
            revnum += num % 10;
            num = num / 10;
        }

        System.out.println(revnum);
    }
}