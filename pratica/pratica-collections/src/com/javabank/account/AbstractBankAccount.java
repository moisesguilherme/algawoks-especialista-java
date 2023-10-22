package com.javabank.account;

abstract public class AbstractBankAccount {

    public final String BANK = "JavaBank";
    // make protected to use in sub-classe
    protected String accountNumber;
    protected String accountName;
    protected double balance;

    private int bonusValue;

    // Constructor for AbastractBankAccount


    public AbstractBankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void print() {
        System.out.println("\nBank Name : " + getBankName() + "\n"
                + "Account Number: " + accountNumber + "\n"
                + "Account Holder: " + accountName + "\n"
                + "Account Balance: " + balance
        );
    }

}
