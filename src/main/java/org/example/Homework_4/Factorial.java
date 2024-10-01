package org.example.Homework_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number and I'll tell you factorial of it");
        int k = sc.nextInt();
        System.out.println(factorial(k));

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
