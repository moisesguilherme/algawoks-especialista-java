package com.javabank.account;

public class CreditAccount extends Account {

    public int creditLimit;

    // Default constructor for CreditAccount
    public CreditAccount() {
        super();
        this.creditLimit = 100;
    }

    // Overloaded constructor for CreditAccount
    public CreditAccount(String accountNumber, String accountName, double balance, int creditLimit) {
        super(accountNumber, accountName, balance);
        this.creditLimit = creditLimit;
    }

    // accessor to get the account creditlimit
    public int getCreditLimit() {
        return creditLimit;
    }

    // Modifier to set the account creditlimit
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    // print method
    public void print() {
        super.print();
        System.out.println("Credit Limit: " + getCreditLimit());
    }

}
