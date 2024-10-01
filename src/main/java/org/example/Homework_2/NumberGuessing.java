package org.example.Homework_2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int inputNumber;
        int randomNumber;
        int maxNumber = 10;

        do {
            System.out.println("Guess number");
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            inputNumber = sc.nextInt();
            Random rand = new Random();
            randomNumber = rand.nextInt(maxNumber);
            if (inputNumber > randomNumber) {
                System.out.println("Too high, try again" + randomNumber);
            } else if (inputNumber < randomNumber) {
                System.out.println("Too low, try again" + randomNumber);
            } else {
                System.out.println("Congratulations");
            }
        }
        while (inputNumber != randomNumber);

        do {
            System.out.println("Input Number and I guess it ");
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            inputNumber = sc.nextInt();
            Random rand = new Random();
            randomNumber = rand.nextInt(maxNumber);
            if (inputNumber < randomNumber) {
                System.out.println("Too high, try again" + randomNumber);
            } else if (inputNumber > randomNumber) {
                System.out.println("Too low, try again" + randomNumber);
            } else {
                System.out.println("Congratulations");
            }
        }
        while (inputNumber != randomNumber);


    }
}




