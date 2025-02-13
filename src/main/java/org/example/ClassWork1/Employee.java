package org.example.ClassWork1;

abstract public class Employee {
    private String name;
    private  int employeeId;

    public  Employee(String name, int employeeId){
        this.name = name;
        this.employeeId=employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDetails(){
        return "Employee's name is "+getName()+", his id is "+getEmployeeId();
    }
     public abstract double calculateSalary();
}
