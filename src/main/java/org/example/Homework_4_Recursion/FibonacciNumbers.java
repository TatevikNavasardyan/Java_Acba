package org.example.Homework_4_Recursion;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a number and I'll tell you Fibonacci of it ");
        int k = scan.nextInt();
        System.out.println(fibonacciNumbers(k));


    }
    public static int fibonacciNumbers (int n){
        if (n <= 1) {
            return n;
        } else {
            return fibonacciNumbers(n-1)+fibonacciNumbers(n-2);

        }
    }

}
