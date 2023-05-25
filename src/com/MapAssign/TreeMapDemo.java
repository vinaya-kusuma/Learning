package com.MapAssign;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args){
        Map<String,Integer> myMap = new TreeMap<>();
        myMap.put("Vindhya",87);
        myMap.put("Anagha",77);
        myMap.put("Ramya",97);
        myMap.put("Anish",100);
        myMap.put("Varun",89);

        for(Map.Entry<String,Integer> entry: myMap.entrySet()) {

            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

        myMap.put("Gautham",65);

        for(Map.Entry<String,Integer> entry: myMap.entrySet()) {

            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
        }


    }

