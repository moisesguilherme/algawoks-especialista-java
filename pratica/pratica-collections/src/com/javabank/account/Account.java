package com.javabank.account;

import java.util.Objects;

// Now extends abastract class instead of interface
public class Account extends AbstractBankAccount{

    private String accountNumber;
    private String accountName;
    private double balance;

    public Account() {
        this.accountNumber = "EMPTY";
        this.accountName = "EMPTY";
        this.balance = 0;
    }

    public Account(String accountNumber, String accountName, double balance) {
        setAccountNumber(accountNumber);;
        setAccountName(accountName);
        setBalance(balance);
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
        Objects.requireNonNull(accountName);
        this.accountName = accountName;
    }

    // implement abstract method
    public void deposit(int amt) {
        balance=balance+amt;
    }


    public void withDraw(int amt) {
        balance=balance-amt;
   }

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


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;

        if (!Objects.equals(accountNumber, that.accountNumber))
            return false;
        return Objects.equals(accountName, that.accountName);
    }


    public int hashCode() {
        int result = accountNumber != null ? accountNumber.hashCode() : 0;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "Account {" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
