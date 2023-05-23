package com.JavaBasicsAssn;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(5);
        myTreeSet.add(10);
        myTreeSet.add(2);
        myTreeSet.add(8);
        myTreeSet.add(3);

        Iterator iterator = myTreeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int maxValue = ((TreeSet<Integer>) myTreeSet).last();
        System.out.println("Maximum value in the TreeSet is: " + maxValue);

        int minValue = ((TreeSet<Integer>) myTreeSet).first();
        System.out.println("Minimum value in the TreeSet is: " + minValue);

        myTreeSet.remove(8);
        System.out.println("Size of the TreeSet is:" +myTreeSet.size());

        }


    }

