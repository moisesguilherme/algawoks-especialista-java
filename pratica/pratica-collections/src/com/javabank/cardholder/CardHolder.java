package com.javabank.cardholder;

import com.javabank.account.BankAccount;
import com.javabank.exceptions.CardHolderAlreadyExists;

import java.util.ArrayList;

public class CardHolder {

    private final ArrayList<BankAccount> cardHolders = new ArrayList<>();

    public void add(String accountNumber, String name, double balance) {
        BankAccount account = new BankAccount(accountNumber, name, balance);

        if(cardHolders.contains(account)) {
            throw new CardHolderAlreadyExists("Cardholder already exists");
        }

        cardHolders.add(account);
    }

    public ArrayList<BankAccount> getAll() {
        return cardHolders;
    }

}
