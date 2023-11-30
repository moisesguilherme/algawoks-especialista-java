package com.javabank.cardholder;

public interface Filter<T> {

    boolean check(T object);

}
