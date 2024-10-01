package org.example.Homework_3;

import java.util.Scanner;

public class LenghtOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a word ");

        String input = scan.nextLine();
        char[] inputArray = input.toCharArray();
        System.out.println("The string has " + inputArray.length + " characters.");


    }


}

