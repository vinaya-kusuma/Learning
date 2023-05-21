package com.JavaBasicsAssn;

import java.util.Scanner;

public class AddOrSub {
    public static void main(String[] args){
        int result =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select an option. 1.Add 2.Subtract");
        int option = scan.nextInt();
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        if (option == 1 ) {

            result = num1+num2;
            System.out.println("The sum of the given numbers is: " + result);
        }
        else if (option ==2) {
           result = num1+num2;
            System.out.println("The difference of the given numbers is: " +  result);
        }
        else{System.out.println("Invalid option");}


        }

    }

