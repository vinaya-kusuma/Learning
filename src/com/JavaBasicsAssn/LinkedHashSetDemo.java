package com.JavaBasicsAssn;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {


    Set<String> myData = new LinkedHashSet<String>();
    myData.add("apple");
        myData.add("banana");
        myData.add("cherry");
        myData.add("date");

        Iterator iterator = myData.iterator();

        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        myData.remove("banana");
        myData.add("elderberry");

        Iterator iterator1 = myData.iterator();

        while(iterator1.hasNext()) {

            System.out.println(iterator1.next());
        }

        System.out.println( myData.size());
        myData.clear();
        }


}

