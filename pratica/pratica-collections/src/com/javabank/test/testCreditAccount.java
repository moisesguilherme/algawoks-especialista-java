package com.javabank.test;

import com.javabank.account.Account;
import com.javabank.account.CreditAccount;

public class testCreditAccount {

    public static void main(String[] args) {

        // Instantiate 3 accounts
        // Using constructor with values
        Account a1 = new Account("AAA-222-001","Maria Santos", 300);

        // Using default constructor
        Account a2 = new Account();
        Account a3 = new Account();

        // Instantiate 2 credit accounts
        // Using default constructor
        CreditAccount c1 = new CreditAccount();

        // Using constructor with values which will call constructor from super
        CreditAccount c2 = new CreditAccount("AAA-222-001", "Marcus Silva", 200, 100);

        // Set values of Instances create using default constructor
        a2.setAccountName("Manoel");
        a2.setAccountNumber("AAA-333-001");
        a2.setBalance(300);

        a3.setAccountName("Maria Carla");
        a3.setAccountNumber("AAA-333-003");
        a3.setBalance(3000);

        c1.setAccountName("Ronaldo Fenômeno");
        c1.setAccountNumber("RF0-444-001");
        c1.setBalance(4000);
        c1.setCreditLimit(1000);

        // Print accounts
        a1.print();
        a2.print();
        a3.print();
        c1.print();
        c2.print();

    }
}
