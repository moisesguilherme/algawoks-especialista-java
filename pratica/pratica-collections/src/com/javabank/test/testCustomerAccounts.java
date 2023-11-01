package com.javabank.test;

import com.javabank.account.AbstractBankAccount;
import com.javabank.account.Account;
import com.javabank.account.CreditAccount;

public class testCustomerAccounts {
    public static void main(String[] args) {
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[6];

        // Instantiate 2 credit accounts using constructor with
        bankAccount[0] = new Account("001-AAA-001", "Maria Marta", 10);
        bankAccount[1] = new Account("002-CAA-002", "Maria Marta", 20);
        bankAccount[2] = new Account("004-CCA-003", "Maria Marta", 20);
        bankAccount[3] = new Account("003-UAI-004", "Maria Marta", 30);
        bankAccount[4] = new Account("004-EE-005", "Maria Marta", 10);

        bankAccount[5] = new CreditAccount("C01-AA-004","Moises Freitas", 300, 1000);

        showAllCustomerAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);

    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccounts) {
        System.out.println("\nAll Customer Accounts ***********");
        for(AbstractBankAccount act: bankAccounts){
            if(act instanceof Account)
                System.out.println(act);
        }
    }

    public static void showAllCreditAccounts(AbstractBankAccount[] bankAccounts) {
        System.out.println("\nAll Credit Accounts ***********");

        for (AbstractBankAccount act : bankAccounts) {
            if(act instanceof CreditAccount)
                System.out.println(act);
        }

    }

}
