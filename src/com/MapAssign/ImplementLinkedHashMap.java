package com.MapAssign;

import java.util.*;

public class ImplementLinkedHashMap {
    public static void main(String[] args){
        List<Integer> linkedList = new LinkedList<>();
        Map<Integer,String> hashmap = new HashMap<>();

        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(9);


        hashmap.put(1,"Adithya");
        hashmap.put(7,"Dhanush");
        hashmap.put(3,"Chaitra");
        hashmap.put(9,"Ganesh");

        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext()){
            int key = (int) iterator.next();
            System.out.println(key +" : " + hashmap.get(key));


        }
    }
}
