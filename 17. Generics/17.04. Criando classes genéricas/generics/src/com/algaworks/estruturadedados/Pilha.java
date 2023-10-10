package com.algaworks.estruturadedados;

import java.util.Arrays;

public class Pilha<T> {
    //LIFO -> Last In First Out

    private T[] itens;

    public Pilha() {
        itens = (T[]) new Object[0];
    }

    public void colocar(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T retirar() {
        if (itens.length == 0) {
            throw new PilhaVaziaException("Pilha sem itens");
        }

        T item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }

}