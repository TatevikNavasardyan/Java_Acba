package org.example.Homework_3;

import org.example.Homework_1.Print;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a word");
        String input = scanner.nextLine();
        System.out.println("how many times to repeat?");
        String  output = input;
        int repeatTime = scanner.nextInt();
        for (int i = 1; i < repeatTime; i++) {
            output=output+input;

        }
        System.out.println(output);
        //yuiytui
    }
}
