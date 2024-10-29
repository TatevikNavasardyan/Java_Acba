package org.example.Homework_4_Recursion;

import java.util.Scanner;

public class FindMinMax {
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

        int min = findMin(array, size);
        int max = findMax(array, size);

        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);

    }

    public static int findMin(int[] numbers, int size) {
        if (size == 1) {
            return numbers[0];
        } else {
            return Math.min(numbers[size - 1], findMin(numbers, size - 1));
        }
    }

    public static int findMax(int[] numbers, int size) {
        if (size == 1) {
            return numbers[0];
        } else {
            return Math.max(numbers[size - 1], findMax(numbers, size - 1));
        }
    }
}

