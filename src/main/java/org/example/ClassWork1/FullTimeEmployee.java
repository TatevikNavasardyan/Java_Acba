package org.example.ClassWork1;

public class FullTimeEmployee extends Employee{
    double salary;


    public FullTimeEmployee(String name, int employeeID, double salary){
        super(name, employeeID);
        this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return salary;

    }

}
