package com.MapAssign;
import java.util.WeakHashMap;
public class WeakHashMapExample {


        public static void main(String[] args) {
            WeakHashMap<Key, Value> map = new WeakHashMap<>();

            // Create some keys and values
            Key key1 = new Key("key1");
            Value value1 = new Value("value1");
            Key key2 = new Key("key2");
            Value value2 = new Value("value2");

            // Put the key-value pairs in the map
            map.put(key1, value1);
            map.put(key2, value2);

            // Check the map's contents
            System.out.println("Map size: " + map.size());  // Output: Map size: 2
            System.out.println("Value for key1: " + map.get(key1));  // Output: Value for key1: value1

            // Let's make key1 eligible for garbage collection
            key1 = null;

            // Run garbage collection to remove the entry with key1
            System.gc();

            // Wait for a short time to allow garbage collection to complete
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check the map's contents again
            System.out.println("Map size: " + map.size());  // Output: Map size: 1
            System.out.println("Value for key1: " + map.get(key1));  // Output: Value for key1: null
        }
    }

