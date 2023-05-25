package com.MapAssign;

import java.util.HashMap;

public class HashMapBasic {

    private static HashMap<Integer,String> hashmap = new HashMap<>();
    public static void main(String[] args){

        //function call to insert key value pairs
        insertKeyValue(1,"ab");
        insertKeyValue(2,"bc");
        insertKeyValue(3,"cd");

        System.out.println(hashmap);
        //function call to retrieve a value
        System.out.println("The value retrieved : " + retrieveValue(2));

        //function call to remove a key value pair

        removeKeyValue(2);

        System.out.println(hashmap);
    }

    public static void insertKeyValue(Integer myKey, String myValue){
        hashmap.put(myKey,myValue);
    }

    public static String retrieveValue(Integer myKey){
        return hashmap.get(myKey);
    }

    public static void removeKeyValue(Integer myKey){
        hashmap.remove(myKey);
    }

}
