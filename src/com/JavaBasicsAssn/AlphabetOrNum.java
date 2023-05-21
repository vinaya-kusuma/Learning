package com.JavaBasicsAssn;

public class AlphabetOrNum {

    public static void main(String[] args) {
        char inp = 'a';
        if(Character.isAlphabetic(inp)){
            System.out.println("Alphabet");
        }
        else if (Character.isDigit(inp)){
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}