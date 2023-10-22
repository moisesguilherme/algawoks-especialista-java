package com.javabank.test;

import com.javabank.account.Account;
import com.javabank.account.CreditAccount;

public class testBank {

    public static void main(String[] args) {

        // Instantiate 3 accounts
        // Using constructor with values
        Account a1 = new Account("AAA-100-203", "Maria Aparecida", 400);
        // Using default constructor
        Account a2 = new Account();
        Account a3 = new Account();

        // Set values of Instances created using default constructor
        a2.setAccountName("José Antônio");
        a2.setAccountNumber("AAA-101-203");
        a2.setBalance(300);

        a3.setAccountName("Marcos Cristiano");
        a3.setAccountNumber("AAC-111-333");
        a3.setBalance(1000);

        // test deposit
        //a1.deposit(100);
        //a1.withDraw(50);

        //a1.print();
        a2.print();
        //a3.print();

    }
}
