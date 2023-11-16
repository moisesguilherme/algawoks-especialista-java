package com.algaworks.crm;

@FunctionalInterface
public interface Filtro<T> {

    abstract boolean avaliar(T objeto);

}
