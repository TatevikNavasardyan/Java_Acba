package org.example.Homework_2;

import java.sql.SQLOutput;

public class SumMethods {

    public static int sum(int x, int y) {
        return x + y;

    }

    public static String sum(String x, String y) {
        return (x + y);


    }

    public static void main(String args[]) {
        int a = 5;
        int b = 17;
        String Z = "SR=TR";
        String K = "KJS";

        System.out.println(sum(a, b));
        System.out.println(sum(Z ,K));

    }
}
