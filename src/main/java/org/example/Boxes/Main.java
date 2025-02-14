package org.example.Boxes;

public class Main {

    public static void main(String[] args) {


        //can store objects of different types in Box
        Box <String>  stringBox = new Box<>();
        stringBox.setValume("45քմ");
        String valumeOfStringBox = stringBox.getValume();
        System.out.println("Արկղի ծավալը կազմում է  " +valumeOfStringBox +":");


        Box <Integer> intBox = new Box<>();
        intBox.setValume(99);
        int valumeOfIntBox = intBox.getValume();
        System.out.println("Արկղի ծավալը կազմում է  " +valumeOfIntBox+"քմ։");
    }
}
