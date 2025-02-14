package org.example.Generics;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();
        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();
        ArrayList<Animals> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Dog());

        Cat myCat = (Cat) cats.get(0);

        shout("Jon");
        shout(57);
    }


        private static  <T>  T  shout (T thingToShout){
            System.out.println(thingToShout+"{{{");
            return thingToShout;
        }

    }


