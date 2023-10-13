package com.algaworks.estruturadedados;

// Interfaces genericas
public interface Colecao<T> {

    void colocar(T item);
    T retirar();
}
