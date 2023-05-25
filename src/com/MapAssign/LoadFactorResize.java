package com.MapAssign;
import java.util.HashMap;

public class LoadFactorResize {
    static int capacity = 16;
   static boolean wasResized = false;
    public static void main(String[] args) {

                HashMap<String, Integer> hashMap = new HashMap<>();

                // Insert some key-value pairs into the HashMap
                hashMap.put("Apple", 10);
                hashMap.put("Banana", 20);
                hashMap.put("Cherry", 30);
                hashMap.put("Durian", 40);
                hashMap.put("Elderberry", 50);
               // hashMap.put("raspberry", 60);
                //hashMap.put("strawberry", 70);
                //hashMap.put("muskmelon", 90);


                // Calculate the load factor and print it
                double loadFactor = calculateLoadFactor(hashMap);
                System.out.println("Load Factor: " + loadFactor);

                // Resize the HashMap if the load factor exceeds a threshold
                double loadFactorThreshold = 0.75;

                resizeHashMap(hashMap, loadFactorThreshold);

                if (wasResized) {

                    // Calculate the load factor after resizing and print it
                    loadFactor = calculateLoadFactor(hashMap);

                    System.out.println("Load Factor after Resizing: " + loadFactor);
                }
                else {
                    System.out.println("No Resizing was required");
                }
            }


            //loadFactor = size/capacity

            public static <K, V> double calculateLoadFactor(HashMap<K, V> map) {
                int size = map.size();
                return (double) size / capacity;
            }

            public static <K, V> void resizeHashMap(HashMap<K, V> map, double loadFactorThreshold) {
                if (calculateLoadFactor(map) > loadFactorThreshold) {
                    capacity *= 2;
                    wasResized = true;
                    HashMap<K, V> resizedMap = new HashMap<>(capacity);
                    resizedMap.putAll(map);
                    map = resizedMap;
                }
            }

    }

