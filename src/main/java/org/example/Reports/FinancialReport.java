package org.example.Reports;

public class FinancialReport implements Reportable {

    private int balance;

    public FinancialReport(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void getReportDetails() {
        System.out.println("Our balance is "+getBalance());

    }


}
