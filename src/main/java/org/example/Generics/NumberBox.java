package org.example.Generics;

public class NumberBox<T extends Number> {
    private T number;

    public double getDoubleValue() {
        return number.doubleValue();
    }
}

// Multiple bounds
//class DataProcessor<T extends Number & Comparable<T>> {
//    // T must be both a Number and Comparable
//}
