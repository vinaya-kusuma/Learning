package com.JavaBasicsAssn;

import java.util.Vector;

public class Example {
public static void main(String[] args){
    Vector <Integer> vector = new Vector<>();

    vector.add(1);
    vector.add(2);
    vector.add(3);

    int length =0;
    for (int i : vector) {
        length += i*i;
    }
    System.out.println(Math.sqrt(length));
    }
}


