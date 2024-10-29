package org.example.Homework_4_Recursion;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("you must enter" + size + " integers");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th integer");
            array[i] = sc.nextInt();
        }
        sc.close();
        printArrayReversed(array, size - 1);

    }

    public static void printArrayReversed(int[] numbers, int size) {
        if (size < 0) {
            return;
        }
        System.out.print(numbers[size]+ ", ");
        printArrayReversed(numbers, size - 1);

    }

}



