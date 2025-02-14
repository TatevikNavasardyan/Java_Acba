package org.example.Accounts;

public class SavingsAccount extends BankAccount{

   private double rate;

    public SavingsAccount(int accountNumber, int balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double monthlyUpdate() {
        return this.getBalance()*(1+getRate()/100);
    }
}
