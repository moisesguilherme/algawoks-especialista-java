package com.javabank.account;

abstract public class AbstractBankAccount {

    public final String BANK = "JavaBank";
    private String accountNumber;
    private String accountName;
    private double balance;

    private int bonusValue;

    // abstract method
    abstract public void deposit(int amt);

    abstract void withDraw(int amt);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }


    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }


    public void print() {
        System.out.println("\nBank Name : " + getBankName() + "\n"
                + "Account Number: " + accountNumber + "\n"
                + "Account Holder: " + accountName + "\n"
                + "Account Balance: " + balance
        );
    }

}
