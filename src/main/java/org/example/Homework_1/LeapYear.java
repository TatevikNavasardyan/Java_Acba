package org.example.Homework_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter  random year");
        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();
        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
            System.out.println("A leap year");
        } else {

            System.out.println("Not a leap year");
        }


    }
}
