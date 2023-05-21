package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetExample {
    public static void main(String[] args){
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(3);
        mySet.add(7);
        mySet.add(0);
        mySet.add(1);

        System.out.println(mySet);
        mySet.forEach(System.out::println);

        //used to remove duplicate values

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(1);
        myList.add(2);
        System.out.println(myList);
        Set<Integer> myNewSet = new HashSet<>();
        myNewSet.addAll(myList);
        System.out.println(myNewSet);
        }
    }


