package org.example.Homework_3;

import java.util.Scanner;

public class PrintStringsChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a word ");

        String input = scan.nextLine();
        char[] output = input.toCharArray();
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        }


}
