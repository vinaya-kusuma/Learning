package com.JavaBasicsAssn;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<Integer> myHash = new HashSet<Integer>();

        //Add values
        myHash.add(1);
        myHash.add(2);
        myHash.add(3);
        myHash.add(4);
        myHash.add(5);
        //Check if HashSet contains 3
        if (myHash.contains(3))
        {
            System.out.println("contains 3");
        }
        else {
            System.out.println("does not contain 3");
        }

        //Remove 4
        myHash.remove(4);

        //Print the size
        System.out.println(myHash.size());
        //Clear the HashSet
        myHash.clear();
        System.out.println(myHash.size());
    }
}
