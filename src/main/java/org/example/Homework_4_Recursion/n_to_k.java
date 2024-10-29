package org.example.Homework_4_Recursion;

import java.util.Scanner;

public class n_to_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter another one");
        int k = sc.nextInt();
        System.out.println(nk(n, k));
    }

    public static int nk(int n, int k) {
        if (n == 1 || k == 1) {
            return n;
        } else {
            return n * nk(n, k-1);
        }

    }
}
