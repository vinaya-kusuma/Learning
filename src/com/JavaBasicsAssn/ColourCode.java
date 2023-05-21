package com.JavaBasicsAssn;

import java.util.Scanner;

public class ColourCode {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the colour code: ");
        String code = scan.next();
        System.out.println(code);
        switch (code) {
            case "R":
                System.out.println("R->Red");
                break;

            case "B":
                System.out.println("B->Blue");
                break;
            case "G":
                System.out.println("G->Green");
                break;
            case "O":
                System.out.println("O->Orange");
                break;
            case "Y":
                System.out.println("Y->Yellow");
                break;
            case "W":
                System.out.println("W->White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}


