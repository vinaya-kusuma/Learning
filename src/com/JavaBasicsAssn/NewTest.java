package com.JavaBasicsAssn;

import java.util.HashMap;
import java.util.WeakHashMap;

public class NewTest {
    public static void main(String[] args) {
        Integer key1 = 1;
        Integer key2 = 2;
        WeakHashMap<Integer, String> weaken = new WeakHashMap<>();
        HashMap<Integer, String> weaken1 = new HashMap<>();
        weaken.put(key1, "a");
        weaken1.put(key2, "b");

        System.gc();
        System.out.println(weaken);
        System.out.println(weaken1);


        key1 = null;
        key2= null;
        System.gc();
        System.out.println(weaken);
        System.out.println(weaken1);


    }
}
