package com.MapAssign;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class TreeAndWeakHashMap {
    public static void main(String[] args){
        Map<Integer,String> treeMap = new TreeMap<>();
        Map<Integer,String> weakHash = new WeakHashMap<>();

        treeMap.put(3,"Allen");
        treeMap.put(6,"Dhanusha");
        treeMap.put(1,"Ramesh");


        weakHash.put(3,"Allen");
        weakHash.put(6,"Dhanusha");
        weakHash.put(1,"Ramesh");

        Iterator iterator = treeMap.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        Iterator iterator1 = weakHash.entrySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());}



            treeMap.put(4,"Swathi");
            weakHash.put(4,"Swathi");



        Iterator iterator2 = treeMap.entrySet().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());

        }



        Iterator iterator3 = weakHash.entrySet().iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());}

            }



        }






