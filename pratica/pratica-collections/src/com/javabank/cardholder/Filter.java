package com.javabank.cardholder;

@FunctionalInterface
public interface Filter<T> {

    // SAM Single Abstract method
    boolean check(T object);

    default void hello() {
        System.out.printf("Hello");
    }

}
