package org.example.Homework_4_Recursion;

import java.util.Scanner;

public class NumberDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        if (number == 0) return 0;
        return number % 10 + sumOfDigits(number / 10);

    }


//    public static int sumOfDigits(int number) {
//        int[] digits = Integer.toString(number).chars().map(Character::getNumericValue).toArray();
//        int sum = 0;
//        for (int i = 0; i < digits.length; i++) {
//            sum +=digits[i];
//
//        }
//        return sum;
//
//    }

}
