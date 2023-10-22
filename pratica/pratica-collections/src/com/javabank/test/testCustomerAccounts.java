package com.javabank.test;

import com.javabank.account.AbstractBankAccount;
import com.javabank.account.Account;

public class testCustomerAccounts {
    public static void main(String[] args) {
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        // Instantiate 2 credit accounts using constructor with
        bankAccount[0] = new Account("001-AAA-001", "Maria Marta", 10);
        bankAccount[1] = new Account("002-CAA-002", "Maria Marta", 20);
        bankAccount[2] = new Account("004-CCA-003", "Maria Marta", 20);
        bankAccount[3] = new Account("003-UAI-004", "Maria Marta", 30);
        bankAccount[4] = new Account("004-EE-005", "Maria Marta", 10);

        showAllCustomerAccounts(bankAccount);

    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccounts) {
        System.out.println("\nAll Customer Accounts ***********");
        for(AbstractBankAccount act: bankAccounts){
            System.out.println(act);
        }
    }

}
