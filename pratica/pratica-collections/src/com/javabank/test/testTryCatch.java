package com.javabank.test;

import com.javabank.account.Account;

public class testTryCatch {

    public static void main(String[] args) {

        Account c1 = new Account();
        String name;
        Integer account;

        name = c1.getAccountName();
        c1.setAccountNumber(null); //NPE -> Other

        try {
            account = Integer.parseInt(c1.getAccountNumber()); // NumberFormatException
            //account = Integer.parseInt(c1.getAccountNumber().toString()); // NPE
        } catch (NumberFormatException e) {
            System.out.println("Incorrect numeric value");
        } catch (Exception e) {
            System.out.println("Other exception");
        } finally {
            System.out.println("It will execute anyway");
        }

    }
}
