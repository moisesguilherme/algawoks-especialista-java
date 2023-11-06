package com.algaworks.crm;

@FunctionalInterface // informa q é uma interface funcional
public interface Filtro<T> {

    abstract boolean avaliar(T objeto);

    //Método da classe object pode, não deixa de ser classe funcional
    //String toString();
    //boolean equals(Object obj);

}