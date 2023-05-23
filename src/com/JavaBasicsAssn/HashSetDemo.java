package com.JavaBasicsAssn;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<Integer> myHash = new HashSet<Integer>();
        myHash.add(1);
        myHash.add(2);
        myHash.add(3);
        myHash.add(4);
        myHash.add(5);

        if (myHash.contains(3))
        {
            System.out.println("contains 3");
        }
        else {
            System.out.println("does not contain 3");
        }

        myHash.remove(4);

        System.out.println(myHash.size());
        myHash.clear();
        System.out.println(myHash.size());
    }
}
