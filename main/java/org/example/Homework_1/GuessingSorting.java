package org.example.Homework_1;

import java.util.Scanner;

public class GuessingSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int[] inputArray = new int[3];
        System.out.println("Enter 3 random numbers");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]= sc.nextInt();

        }

        if (inputArray[0] < inputArray[1] && inputArray[1] < inputArray[2]) {
            System.out.println("increasing");
        } else if (inputArray[0] > inputArray[1] && inputArray[1] > inputArray[2]) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");

        }

    }
}
