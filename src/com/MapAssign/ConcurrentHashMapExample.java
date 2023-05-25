package com.MapAssign;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {


        public static void main(String[] args) {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

            // Perform thread-safe operations on the concurrent hashmap - populating the map
            map.put("Key1", 1);
            map.put("Key2", 2);
            map.put("Key3", 3);
            //map.put("Key4",null); // does not allow null in keys and values
            System.out.println("Initial ConcurrentHashMap: " + map);

            // Perform additional thread-safe operations
            map.putIfAbsent("Key1", 10); // Key1 already exists, so no change is made
            map.replace("Key2", 20);
            map.remove("Key3", 3);

            System.out.println("Updated ConcurrentHashMap: " + map);
        }
    }

