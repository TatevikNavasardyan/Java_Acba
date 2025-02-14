package org.example.Accounts;

public class CheckingAccount extends BankAccount {

    private  int fee =300;

    public CheckingAccount(int accountNumber, int balance) {
        super(accountNumber, balance);

    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public double monthlyUpdate() {
        return  this.getBalance()-getFee();

    }


}
