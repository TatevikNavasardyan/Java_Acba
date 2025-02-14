package org.example.Employees;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("Karen", 154, 780000);
        Employee manager1 = new Manager("Artur", 111, 790000);
        Employee subordinate1 = new Employee("Lilia", 524, 180000);
        Employee subordinate2 = new Employee("Vahe", 417, 250000);
        Employee subordinate3 = new Employee("Kakach", 5247, 620000);

        manager.addSubordinate(subordinate1);
        manager.addSubordinate(subordinate2);
        manager.addSubordinate(subordinate3);
        System.out.println(manager);
        manager.removeSubordinate(subordinate1);
        System.out.println("After removing first  subordinate, " + manager);

    }
}
