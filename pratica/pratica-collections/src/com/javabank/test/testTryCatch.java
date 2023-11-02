package com.javabank.test;

import com.javabank.account.Account;
import com.javabank.exception.FirstException;

public class testTryCatch {

    public static void main(String[] args) {

        Account c1 = new Account();
        String name;
        Integer account;

        name = c1.getAccountName();
        c1.setAccountNumber(null); //NPE -> Other

        try {
            throw new FirstException("Error First");
            //account = Integer.parseInt(c1.getAccountNumber()); // NumberFormatException
            //account = Integer.parseInt(c1.getAccountNumber().toString()); // NPE
        } catch (NumberFormatException | FirstException ex) {
            if(ex instanceof NumberFormatException)
                System.out.println("Incorrect numeric value");
            else
                System.out.println("Other exception");
        } finally {
            System.out.println("It will execute anyway");
        }

    }
}
