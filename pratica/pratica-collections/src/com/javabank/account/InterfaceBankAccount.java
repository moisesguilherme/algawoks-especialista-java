package com.javabank.account;

public interface InterfaceBankAccount {

    public final String BANK = "JavaBank";

    public void deposit(int amt);
    public void withDraw(int amt);
    public double getBalance();
    public String getBankName();
    public void print();
}
