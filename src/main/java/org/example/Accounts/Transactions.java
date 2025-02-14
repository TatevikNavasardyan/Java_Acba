package org.example.Accounts;

public class Transactions<T> {

    private T transactionType;

    public Transactions(T transactionType) {
        this.transactionType = transactionType;
    }

    public T getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(T transactionType) {
        this.transactionType = transactionType;
    }


}
