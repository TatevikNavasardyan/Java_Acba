package org.example.Generics;

public class Printer  <T extends Animals>{
   T  thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
 public void print(){
     System.out.println(thingToPrint);
 }


}
