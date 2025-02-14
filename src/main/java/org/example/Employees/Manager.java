package org.example.Employees;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, int id, int salary) {
        super(name, id, salary);

    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);

    }

    public void removeSubordinate(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        return "Manager "+getName()  + " has "+subordinates.size()+" subordinates.";
    }
}
