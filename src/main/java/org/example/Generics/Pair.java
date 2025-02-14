package org.example.Generics;

import java.util.List;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    void process(List<? extends Number> numbers) {
        // Can read Numbers from the list
    }

    // Lower bounded wildcard
    void addNumbers(List<? super Integer> list) {
        // Can add Integers to the list
    }

    // Unbounded wildcard
    void printList(List<?> list) {
        // Can only read Objects
    }

}
