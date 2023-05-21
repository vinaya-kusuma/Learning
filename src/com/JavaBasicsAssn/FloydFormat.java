package com.JavaBasicsAssn;

import java.util.Scanner;

public class FloydFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = scan.nextInt();

        /*for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }*/
int i=1;
        while (i<=num) {
           int  j=1;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        }

    }

