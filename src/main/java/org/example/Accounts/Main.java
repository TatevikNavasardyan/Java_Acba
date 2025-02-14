package org.example.Accounts;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    BankAccount savingAcc22025 = new SavingsAccount(220251254, 20000,  10);
    BankAccount checkingAcc22021 = new CheckingAccount(220211247, 1300);

        System.out.println(savingAcc22025.monthlyUpdate());
        System.out.println(checkingAcc22021.monthlyUpdate());
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        accounts.put(10001, savingAcc22025);
        accounts.put(10002, checkingAcc22021);



    }
}
