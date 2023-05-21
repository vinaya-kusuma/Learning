package com.JavaBasicsAssn;

public class ChangeAlphabetCase {

    public static void main(String[] args) {

        char sm = 'A';
        int val = (int) sm;

        if (val >= 97 && val <= 122) {

            int gr = val - 32;

            System.out.println(sm + "->" + (char)gr);

        }
        else {
            System.out.println(sm + "->" + (char)(sm+32));
        }

    }
}