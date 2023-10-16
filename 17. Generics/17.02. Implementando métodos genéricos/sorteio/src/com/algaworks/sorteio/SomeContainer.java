package com.algaworks.sorteio;

public class SomeContainer<E> {

    private final Factory<E> factory;

    public SomeContainer(Factory<E> factory) {
        this.factory = factory;
    }

    E createContents() {
        return factory.create();
    }
}
