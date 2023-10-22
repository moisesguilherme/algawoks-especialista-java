package com.javabank.exceptions;

public class CardHolderAlreadyExists extends RuntimeException{

    public CardHolderAlreadyExists(String message) {
        super(message);
    }
}
