package org.example.ClassWork1;

public class Main {
    public static void main(String[] args) {


        FullTimeEmployee fullTimeEmployee =  new FullTimeEmployee("Daniel", 2266, 500.5);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Dani", 421, 80.3, 5);
        Intern intern = new Intern("Dada", 111, 50);
        Employee [] empArray= {fullTimeEmployee, partTimeEmployee, intern};

        for (Employee emp:empArray) {
            System.out.println(emp.getDetails()+" and salary is equal "+emp.calculateSalary());
        }


    }
}
