package com.algaworks.crm;

@FunctionalInterface // informa q é uma interface funcional
public interface Filtro<T> {

    abstract boolean avaliar(T objeto);

}