package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap <String, Integer> empIds = new HashMap<>();

    empIds.put("john", 1234);
    empIds.put("Ara", 456789);
    empIds.put("Karen", 7452);
    System.out.println(empIds);

    System.out.println( empIds.get("Ara"));








    }
}
