package com.MapAssign;

public class HashAlgorithm {

    static int capacity = 5;
    public static void main(String[] args){

        int key = 7;

        int capacity = 5;

        int code1 = generateHashCode(key);

        System.out.println(code1);


    }


    public static int generateHashCode(int key){

        return key%capacity;
    }
}
