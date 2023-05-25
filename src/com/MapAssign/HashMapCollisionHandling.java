package com.MapAssign;

public class HashMapCollisionHandling {
    public static void main(String[] args) {
        // Separate Chaining HashMap
        SeparateChainingHashMap<Integer, String> separateChainingMap = new SeparateChainingHashMap<>(10);
        separateChainingMap.put(1, "John");
        separateChainingMap.put(2, "Alice");
        separateChainingMap.put(3, "Bob");

        System.out.println("Separate Chaining HashMap:");
        System.out.println("Size: " + separateChainingMap.size());
        System.out.println("Key 2: " + separateChainingMap.get(2));
        System.out.println("Contains Key 3: " + separateChainingMap.containsKey(3));
        System.out.println("Contains Key 4: " + separateChainingMap.containsKey(4));

        separateChainingMap.remove(2);
        System.out.println("Contains Key 2 after removal: " + separateChainingMap.containsKey(2));

        System.out.println();

        // Linear Probing HashMap
        LinearProbingHashMap<Integer, String> linearProbingMap = new LinearProbingHashMap<>();
        linearProbingMap.put(1, "John");
        linearProbingMap.put(2, "Alice");
        linearProbingMap.put(3, "Bob");

        System.out.println("Linear Probing HashMap:");
        System.out.println("Size: " + linearProbingMap.size());
        System.out.println("Key 2: " + linearProbingMap.get(2));
        System.out.println("Contains Key 3: " + linearProbingMap.containsKey(3));
        System.out.println("Contains Key 4: " + linearProbingMap.containsKey(4));

        linearProbingMap.remove(2);
        System.out.println("Contains Key 2 after removal: " + linearProbingMap.containsKey(2));
    }
}

