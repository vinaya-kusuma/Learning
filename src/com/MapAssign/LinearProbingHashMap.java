package com.MapAssign;


class LinearProbingHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public LinearProbingHashMap() {
        this.table = new Entry[DEFAULT_CAPACITY];
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
    }

    public void put(K key, V value) {
        if (size >= LOAD_FACTOR * capacity) {
            resize();
        }

        int index = findIndex(key);


        while (table[index] != null && !table[index].key.equals(key)) {
            index = (index + 1) % capacity;
        }

        if (table[index] == null) {
            table[index] = new Entry<>(key, value);
            size++;
        } else {
            table[index].value = value;
        }
    }

    public V get(K key) {
        int index = findIndex(key);

        if (table[index] != null && table[index].key.equals(key)) {
            return table[index].value;
        }

        return null;
    }

    public void remove(K key) {
        int index = findIndex(key);

        if (table[index] != null && table[index].key.equals(key)) {
            table[index] = null;
            size--;
        }
    }

    public boolean containsKey(K key) {
        int index = findIndex(key);

        return table[index] != null && table[index].key.equals(key);
    }

    public int size() {
        return size;
    }

    private int findIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % capacity;

        while (table[index] != null && !table[index].key.equals(key)) {
            index = (index + 1) % capacity;
        }

        return index;
    }

    private void resize() {
        capacity *= 2;
        Entry<K, V>[] oldTable = table;
        table = new Entry[capacity];
        size = 0;

        for (Entry<K, V> entry : oldTable) {
            if (entry != null) {
                put(entry.key, entry.value);
            }
        }
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}