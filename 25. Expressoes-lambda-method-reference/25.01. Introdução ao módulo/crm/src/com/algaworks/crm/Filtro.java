package com.algaworks.crm;

public interface Filtro<T> {

    // é um método abastract
    // SAM Single Abstract método - interface funcional
    abstract boolean avaliar(T objeto);

    // Não pode ter outro método
    //void testar();

    // pode ter default
    default void ola() {
        System.out.println("olá");
    }
}