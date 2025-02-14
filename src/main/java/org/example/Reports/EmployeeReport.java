package org.example.Reports;

public class EmployeeReport  implements Reportable{
    private int employeeCount;

    public EmployeeReport(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public void getReportDetails() {
        System.out.println("Our employees are "+getEmployeeCount());
    }
}
