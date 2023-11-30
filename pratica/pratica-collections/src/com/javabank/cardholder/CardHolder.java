package com.javabank.cardholder;

import com.javabank.account.Account;
import com.javabank.exceptions.CardHolderAlreadyExists;

import java.util.ArrayList;
import java.util.List;

public class CardHolder {

    private final ArrayList<Account> cardHolders = new ArrayList<>();

    public void add(String accountNumber, String name, double balance) {
        Account account = new Account(accountNumber, name, balance);

        if(cardHolders.contains(account)) {
            throw new CardHolderAlreadyExists("Cardholder already exists");
        }

        cardHolders.add(account);
    }

    public List<Account> consult(Filter<Account> filter) {
        List<Account> cardholderFilter = new ArrayList<>();

        for (Account account: cardHolders) {
            if(filter.check(account)) {
               cardholderFilter.add(account);
            }
        }

        return cardholderFilter;
    }

    public ArrayList<Account> getAll() {
        return cardHolders;
    }

}
