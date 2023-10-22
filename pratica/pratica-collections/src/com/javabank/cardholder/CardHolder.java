package com.javabank.cardholder;

import com.javabank.account.Account;
import com.javabank.exceptions.CardHolderAlreadyExists;

import java.util.ArrayList;

public class CardHolder {

    private final ArrayList<Account> cardHolders = new ArrayList<>();

    public void add(String accountNumber, String name, double balance) {
        Account account = new Account(accountNumber, name, balance);

        if(cardHolders.contains(account)) {
            throw new CardHolderAlreadyExists("Cardholder already exists");
        }

        cardHolders.add(account);
    }

    public ArrayList<Account> getAll() {
        return cardHolders;
    }

}
