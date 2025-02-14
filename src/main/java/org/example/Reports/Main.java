package org.example.Reports;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Reportable> reports = new ArrayList<>();
        reports.add(new EmployeeReport(1600));
        reports.add(new FinancialReport(2000000000));
        for (Reportable report:reports){
            report.getReportDetails();
        }

    }
}
