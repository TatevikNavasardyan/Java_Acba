package org.example.Homework_4_Recursion;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a world");
        String isPalindromeWord = sc.nextLine();
        System.out.println(isPalindrome(isPalindromeWord));
    }

    public static boolean isPalindrome(String word) {
        int firstIndex = 0;
        int lastIndex = word.length() - 1;
        if (word.charAt(firstIndex) != word.charAt(lastIndex)) {
            return false;
        }
        return lastIndex <= 1 || isPalindrome(word.substring(firstIndex + 1, lastIndex));
    }

}
