package com.algaworks.estruturadedados;

import java.util.Arrays;

public class Pilha {
    //LIFO -> Last In First Out

    private Object[] itens;

    public Pilha() {
        itens =  new Object[0];
    }

    public void colocar(Object item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public Object retirar() {
        if (itens.length == 0) {
            throw new PilhaVaziaException("Pilha sem itens");
        }

        Object item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }

}